s1={1,2,3,4}
s2={3,4,5,6}
u=s1.union(s2)
i=s1.intersection(s2)
print(f"Union of s1 and s2 : {u}")
print(f"Intersection of s1 and s2 : {i}")
print(s1.issubset(s2))
print(s2.issubset(s1))