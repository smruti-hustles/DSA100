n=input()
v=0
c=0
d=0
e=0
for i in n:
    if(i.isalpha()):
        if(i=='a' or i=='e' or i=='i' or i=='o' or i=='u' or i=='A' or i=='E' or i=='I' or i=='O' or i=='U'):
            v+=1
        else:
            c+=1   
    elif(i.isdigit()):
        d+=1
    elif(i.isspace()):
        e+=1    

print("no of vowwels = ",v)   
print("no of consonants = ",c)      
print("no of digits = ",d)   
print("no of spaces = ",e)     

