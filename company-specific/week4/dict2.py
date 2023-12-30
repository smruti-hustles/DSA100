countries={"USA","Canada","Mexico"}
population={"USA":"331 million","Canada":"38 million","Mexico":"126 million"}
countries.add("Brazil")
population["Brazil"]="30 million"
print(population)
for i in population:
    print(f"{i} ----- {population[i]}")