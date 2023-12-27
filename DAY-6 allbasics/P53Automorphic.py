#automorphic number last digits of square of number==number eg..76==5776
n=int(input())
s=str(n)
l=len(s)
sq=n**2
sq1=str(sq)
s1=sq1[::-1]
s2=s1[0:l]
s3=s2[::-1]
if s3==s:
    print("yes")
else:
    print("No")