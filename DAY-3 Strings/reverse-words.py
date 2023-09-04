#reverse words in a string
import re
def reverseString(s:str) -> str:
    result=""
    r=re.split(" ",s)
    t=r[::-1]
    for i in t:
        result=result+i+" "
    return result  
n=input()    
print(reverseString(n)) 