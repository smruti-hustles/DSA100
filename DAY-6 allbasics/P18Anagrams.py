p=input()
q=input()
if(len(p)!=len(q)):
    print(f"{p} and {q} are not anagrams")
else:
    if sorted(p)==sorted(q):
        print(f"{p} and {q} are anagrams") 
    else:
        print(f"{p} and {q} are not anagrams")