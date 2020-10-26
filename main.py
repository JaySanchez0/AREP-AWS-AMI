import random
li = ["Juan","Nueva","York", "City","nuevo","mision","Panel","Window","Numbers","Aleatory","Gums","Double","Travel","Sap"]
def main():
    """
    da = open("data.txt")
    text = da.readlines()
    cont = 0
    for i in text:
        for j in i.split(" "):
            cont+=1
    """
    da = open("src/main/resources/data.txt","a")
    for i in range(10000):
        line = ""
        for j in range(1000):
            line = line+" "+li[random.randint(0,len(li)-1)]
        da.write(line+"\n")
main()
