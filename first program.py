Python 3.10.0 (tags/v3.10.0:b494f59, Oct  4 2021, 19:00:18) [MSC v.1929 64 bit (AMD64)] on win32
Type "help", "copyright", "credits" or "license()" for more information.
def say_hi(name):
    if name == '':
        print("You didn't enter your name!")
    else:
        print("Hi there...")
        for letter in name:
            print(letter)

            
name = input()
<enter your name at this point>
say_hi(name)
Hi there...
<
e
n
t
e
r
 
y
o
u
r
 
n
a
m
e
 
a
t
 
t
h
i
s
 
p
o
i
n
t
>
def say_hi(name):
    if name == '':
        print("You didn't enter your name!")
    else:
        print("Hi there...")
    for letter in name:
        print(letter)

        
say_hi("Mathias")
Hi there...
M
a
t
h
i
a
s
