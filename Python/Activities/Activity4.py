user1 = input("Enter player1 name")
user2 = input("Enter player2 name")
gameOn = True
while gameOn:
    user1_answer = input("Choose rock,paper or scissor").lower()
    user2_answer = input("Choose rock,paper or scissor").lower()

    if user1_answer == user2_answer:
        print("It's a tie")
    elif user1_answer=="rock":
        if user2_answer=="scissors":
            print("Rock wins")
        else:
            print("Paper wins")
    elif user1_answer=="paper":
        if user2_answer=="rock":
            print("Paper wins")
        else:
            print("Scissors wins")
    elif user1_answer=="scissors":
        if user2_answer=="rock":
            print("Rock wins")
        else:
            print("Scissors wins")
    else:
        print("Wrong input")
    repeat = input("Do you want to play again yes/no pls").lower()   
    if repeat=="yes":
        pass
    elif repeat=="no":
        gameOn = False
    else:
        print("invalid input exiting game")
        raise SystemExit
