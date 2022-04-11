mylist1 = list(input("enter comma sperated nubers").split(","))
mylist2 = list(input("enter comma sperated nubers").split(","))
mylist3 = []
for i in mylist1:
    if int(i)%2==0:
        mylist3.append(i)
for j in mylist2:
    if not int(j)%2==0:
        mylist3.append(j)

print(mylist3)
