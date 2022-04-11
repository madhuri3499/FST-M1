mytuple = tuple(input("Enter comma seperated numbers").split(","))
for item in mytuple:
    if int(item)%5==0:
        print(item)