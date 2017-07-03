package com.javamultiplex.behavioral.mediator;

public class TestMediatorPattern {

	public static void main(String[] args) {

		ChatMediator mediator = new ChatMediatorImp();
		User user1 = new User("Rohit", mediator);
		User user2 = new User("Shivani", mediator);
		User user3 = new User("Bhavna", mediator);
		User user4 = new User("Rahul", mediator);
		mediator.addUser(user1);
		mediator.addUser(user2);
		mediator.addUser(user3);
		mediator.addUser(user4);
		user1.send("Hey, whats up!!");
	}

}
