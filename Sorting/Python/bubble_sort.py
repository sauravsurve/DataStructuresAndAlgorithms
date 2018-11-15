lst=[]
for i in range(10):
    lst.append(int(input("Enter an integer: ")))
print ("The entered numbers are as follows...\n")
for i in range(10):
    print (lst[i])
    
for i in range (10):
    for j in range(9):
        if (lst[j]>lst[j+1]):
            temp=lst[j]
            lst[j]=lst[j+1]
            lst[j+1]=temp
print ("The sorted list is as follows...\n")
for i in range(10):
    print(lst[i])
        
               
