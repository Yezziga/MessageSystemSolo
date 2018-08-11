package Client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.ImageIcon;

import Server.User;

public class Message implements Serializable {
	private User sender;
	private ArrayList<String> receivers;
	private String message;
	private ImageIcon image;
	private Calendar dateSent;
	private Calendar dateReceived;

	public Message(User sender, ArrayList<String> receivers, String message) {
		this.sender = sender;
		this.receivers = receivers;
		this.message = message;
	}

	public Message(User sender, ArrayList<String> receivers, String message, ImageIcon image) {
		this.sender = sender;
		this.receivers = receivers;
		this.message = message;
		this.image = image;
	}

	public void setSender(User user) {
		this.sender = user;
	}

	public void setReceiver(ArrayList<String> receivers) {
		this.receivers = receivers;
	}

	public User getSender() {
		return sender;
	}

	public String getMessage() {
		return message;
	}

	public ImageIcon getImage() {
		return image;
	}

	public void setImage(ImageIcon image) {
		this.image = image;
	}

	public ArrayList<String> getReceivers() {
		return receivers;
	}

	public void setDateSend(Calendar cal) {
		this.dateSent = cal;
	}

	public void setDateReceived(Calendar cal) {
		this.dateReceived = cal;
	}

	public Calendar getDateSend() {
		return dateSent;
	}

	public Calendar getDateReceived() {
		return dateReceived;
	}

	public void remove(String name) {
		receivers.remove(name);
	}

}