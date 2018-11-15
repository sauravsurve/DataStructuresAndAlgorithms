lst=[]
for i in range(10):
    x=int(input("Enter the number in the array: "))
    lst.append(x)

num=int(input("Enter the number you want to search in the array"))
found=0
for i in range(10):
    if (lst[i]==num):
        print ("Number found at index: " + str(i))
        found=1
        break

if (found==0):
      print ("Number not found")
