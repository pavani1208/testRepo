package com.example.project.client;

import com.example.project.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MyGWT implements EntryPoint {
	/**
	 * The message displayed to the user when the server cannot be reached or
	 * returns an error.
	 */
	private static final String SERVER_ERROR = "An error occurred while "
			+ "attempting to contact the server. Please check your network " + "connection and try again.";

	/**
	 * Create a remote service proxy to talk to the server-side Greeting service.
	 */
	private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {

		Label headerLabel = new Label();

		// Create a button
		Button button = new Button("Click Me!");

		// Add click handler to the button
		button.addClickHandler(event -> {
			// Do something when the button is clicked
			headerLabel.setText("Button Clicked!");
		});

		// Add label and button to the root panel
		RootPanel.get().add(headerLabel);
		RootPanel.get().add(button);
		// ----------------------

		 // Create a vertical panel to hold the login elements
        VerticalPanel panel = new VerticalPanel();

        // Create text boxes for username and password
        TextBox usernameTextBox = new TextBox();
        usernameTextBox.getElement().setPropertyString("placeholder", "Username");
        
        PasswordTextBox passwordTextBox = new PasswordTextBox();
        passwordTextBox.getElement().setPropertyString("placeholder", "Password");
        
        // Create a button to submit the login
        Button loginButton = new Button("Login");
        loginButton.addClickHandler(event -> {
            String username = usernameTextBox.getText();
            String password = passwordTextBox.getText();
            
            // Validate username and password
            if (isValidLogin(username, password)) {
                // Successful login
                RootPanel.get().clear();
                RootPanel.get().add(new Label("Welcome, " + username + "!"));
            } else {
                // Failed login
                RootPanel.get().add(new Label("Invalid username or password."));
            }
        });
        
        // Add elements to the panel
        panel.add(usernameTextBox);
        panel.add(passwordTextBox);
        panel.add(loginButton);
        
        // Add the panel to the root panel
        RootPanel.get().add(panel);
    }
    
    private boolean isValidLogin(String username, String password) {
        // Perform your login validation here
        // For simplicity, this example considers "user" as valid username and "password" as valid password
        return username.equals("user") && password.equals("password");
    }
	
}
