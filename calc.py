from os import system
from math import sqrt

def main():
    system('cls');
    print("1. Addition\n2. Subtraction\n3. Multipication\n4. Division\n5. Area of Triangle\n6. Quadratic Solutions\n7. Converter\n8. Print\n")
    option = int(input("Enter Your Choice: "))
    switchers = {
        1: addition,
        2: substraction,
        3: multipication,
        4: division,
        5: triangle,
        6: quadratic,
        7: converter,
        8: printing
    }
    switchers.get(option)()

def addition():
    system('cls')
    a = float(input("Enter 1st Number: "))
    b = float(input("Enter 2nd Number: "))
    c = a + b
    print("\nSum of %0.2f and %0.2f is : %0.2f" % (a, b, c))

def substraction():
    system('cls')
    a = float(input("Enter 1st Number: "))
    b = float(input("Enter 2nd Number: "))
    c = a - b
    print("\nDifference of %0.2f and %0.2f is : %0.2f" % (a, b, c))

def multipication():
    system('cls')
    a = float(input("Enter 1st Number: "))
    b = float(input("Enter 2nd Number: "))
    c = a * b
    print("\nMultipication of %0.2f and %0.2f is : %0.2f" % (a, b, c))

def division():
    system('cls')
    a = float(input("Enter 1st Number: "))
    b = float(input("Enter 2nd Number: "))
    c = a / b
    print("\nDivision of %0.2f and %0.2f is : %0.2f" % (a, b, c))

def triangle():
    system('cls')
    a = float(input("Enter 1st Side: "))
    b = float(input("Enter 2st Side: "))
    c = float(input("Enter 3st Side: "))
    s = (a + b + c)/2
    area = (s*(s-a)*(s-b)*(s-c)) ** 0.5  
    print('The area of the triangle is %0.2f' %area)

def quadratic():
    system('cls')
    print("Quadratic Function : (a * x^2) + b*x + c")
    a = float(input("Enter Value of a: "))
    b = float(input("Enter Value of b: "))
    c = float(input("Enter Value of c: "))

    r = b**2 - 4*a*c;
    if r > 0:
        roots = 2
        x = (((-b) + sqrt(r))/(2*a))
        y = (((-b) + sqrt(r))/(2*a))
        print("There are two roots: %f an d %f" % (x, y))
    elif r == 0:
        roots = 1
        x = (-b) / 2*a
        print("There is 1 root: ", x)
    else:
        roots = 0
        print("No Roots, Disctiminant is less than 0.")

def converter():
    system('cls')
    print("1. Celsius to Fahrenheit\n2. Fahrenheit to Celsius\n")
    option1 = int(input("Enter Your Choice: "))
    switchers = {
        1: celsius,
        2: fahrenheit
    }
    switchers.get(option1)()

def celsius():
    system('cls')
    cel = float(input("Enter Temperature in Celsius: "))
    f = (cel * 9/5) + 32;
    print("The Temperature of %f Celsius in Fahrenheit is : %f" % (cel, f))
def fahrenheit():
    system('cls')
    f = float(input("Enter Temperature in Fahrenheit: "))
    cel = (f - 32) * 5/9
    print("The Temperature of %f Fahrenheit in Celsius is : %f" % (f, cel))

def printing():
    system('cls')
    print("\"Hello World\"")
    print('\'Hello World\'')
    message = "Hello World (Printed using a variable)"
    print(message)

main()
