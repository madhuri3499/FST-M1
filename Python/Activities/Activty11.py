fruit = {"apple":10,"banana":6,"berry":20}

check_fruit = input("Enter fruit name").lower()

if(check_fruit in fruit):
    print("Fruit present")
else:
    print("Fruit not present")