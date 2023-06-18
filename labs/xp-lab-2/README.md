# Exercise: Pair Programming - Number Guesser

Objective: Practice pair programming by implementing a simple number guessing game in Java.

Throughout the exercise, focus on the importance of effective communication, collaboration, and actively switching roles between the driver and navigator. You need to engage in discussions, ask questions, and support each other in understanding and implementing the code. 

The exercise is to experience the benefits of pair programming, such as improved code quality, knowledge sharing, and collective problem-solving.


## Instructions:

1. Join a rooms as a pair, with one person taking on the role of the `driver` and the other as the `navigator`.
2. The driver will be responsible for writing the code, while the navigator will observe, provide guidance, and actively engage in the decision-making process.
3. Rules and objectives of the Number Guesser game:
   - The game will generate a random number between 1 and 100.
   - The player's objective is to guess the correct number within a limited number of attempts.
   - After each guess, the game will provide feedback on whether the guess was too high or too low.
   - The game will end when the player guesses the correct number or runs out of attempts.
4. Start with the following steps:

📋 Step 1: Set up the project
- Create a new Java project in your preferred Integrated Development Environment (IDE).
- Set up a new class named `NumberGuesser` to hold the game logic.

📋 Step 2: Write the main method
- In the `NumberGuesser` class, write the main method to initiate the game.
- Prompt the player to enter their name.
- Generate a random number between 1 and 100 to be guessed by the player.

📋 Step 3: Implement the game loop
- Create a loop that allows the player to make multiple guesses until they either guess the correct number or run out of attempts.
- Prompt the player to enter their guess.
- Compare the guess with the generated random number and provide appropriate feedback (e.g., "Too high" or "Too low").
- Track the number of attempts and display it to the player.

📋 Step 4: Add game-ending conditions
- Implement conditions for ending the game.
- If the player guesses the correct number, display a congratulatory message and the number of attempts.
- If the player runs out of attempts without guessing the correct number, display a message indicating the game is over and reveal the correct number.

📋 Step 5: Refactor and improve the code
- Review the code together and identify any areas that can be improved or refactored.
- The pair need to discuss and implement any necessary changes to enhance the code's readability, efficiency, or maintainability.

📋 Step 6: Switch roles
- After completing the initial implementation, the driver and navigator should switch roles.
- The navigator becomes the driver, and vice versa.
- Repeat steps 2 to 5, allowing the new driver to take the lead in implementing the changes.

📋 Step 7: Test and verify the game's functionality
- Run the program and test it by playing the game.
- Verify that the game behaves as expected, providing accurate feedback and ending correctly based on the player's guesses.

📋 Step 8: Optional - Extend the game
- If time permits, the pairs can extend the game by adding new features or enhancements.
- For example, you could implement a scoring system, add difficulty levels, or provide more engaging user interfaces.
