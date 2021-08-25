#Made By BeetJuice101

import random
from tkinter import *
import tkinter

def rock():
    pre = ["p", "p", "s", "s"]
    choice = random.choice(pre)

    root = tkinter.Tk()
    root.title('Rock Paper Scissors')
    root.geometry("600x400")
    root.config(bg = "black")

    if choice == "p":
        canvas = Canvas(root, width= 1000, height= 750, bg="black")
        canvas.create_text(300, 200, text= "You Lost",fill="white",font=('Helvetica 60 bold'))
        canvas.place(x=0, y=0)

    if choice == "s":
        canvas = Canvas(root, width= 1000, height= 750, bg="black")
        canvas.create_text(300, 200, text= "You Won",fill="white",font=('Helvetica 60 bold'))
        canvas.place(x=0, y=0)

    back_btn = tkinter.Button(root, text="X", bg="white", command = lambda : [root.destroy(), main()])
    back_btn.place(x=563, y=0)

    root.mainloop()

def scissors():
    pre = ["r", "r", "r", "p", "p"]
    choice = random.choice(pre)

    root = tkinter.Tk()
    root.title('Rock Paper Scissors')
    root.geometry("600x400")
    root.config(bg = "black")

    if choice == "r":
        canvas = Canvas(root, width= 1000, height= 750, bg="black")
        canvas.create_text(300, 200, text= "You Lost",fill="white",font=('Helvetica 60 bold'))
        canvas.place(x=0, y=0)

    if choice == "p":
        canvas = Canvas(root, width= 1000, height= 750, bg="black")
        canvas.create_text(300, 200, text= "You Won",fill="white",font=('Helvetica 60 bold'))
        canvas.place(x=0, y=0)

    back_btn = tkinter.Button(root, text="X", bg="white", command = lambda : [root.destroy(), main()])
    back_btn.place(x=563, y=0)

    root.mainloop()

def paper():
    pre = ["r", "r", "r", "s", "s"]
    choice = random.choice(pre)

    root = tkinter.Tk()
    root.title('Rock Paper Scissors')
    root.geometry("600x400")
    root.config(bg = "black")

    if choice == "s":
        canvas = Canvas(root, width= 1000, height= 750, bg="black")
        canvas.create_text(300, 200, text= "You Lost",fill="white",font=('Helvetica 60 bold'))
        canvas.place(x=0, y=0)

    if choice == "r":
        canvas = Canvas(root, width= 1000, height= 750, bg="black")
        canvas.create_text(300, 200, text= "You Won",fill="white",font=('Helvetica 60 bold'))
        canvas.place(x=0, y=0)

    back_btn = tkinter.Button(root, text="X", bg="white", command = lambda : [root.destroy(), main()])
    back_btn.place(x=563, y=0)

    root.mainloop()

def main():
    root = tkinter.Tk()
    root.title('Rock Paper Scissors')
    root.geometry("600x400")
    root.config(bg = "white")

    canvas = Canvas(root, width=1000, height=750, bg="black")
    canvas.create_text(300, 50, text="Rock Paper Scissors",fill="white",font=('Helvetica 30 bold'))
    canvas.pack()

    rock_btn = tkinter.Button(root, text="Rock", bg="black", padx=79, pady=10, command = lambda : [root.destroy(), rock()], border=0, font='Helvetica 30 bold', fg='white')
    paper_btn = tkinter.Button(root, text="Paper", bg="black", padx=72, pady=10, command = lambda : [root.destroy(), paper()], border=0, font='Helvetica 30 bold', fg='white')
    scissors_btn = tkinter.Button(root, text="Scissors", bg="black", padx=45, pady=10, command = lambda : [root.destroy(), scissors()], border=0, font='Helvetica 30 bold', fg='white')

    rock_btn.place(x=157, y=100)
    paper_btn.place(x=157, y=200)
    scissors_btn.place(x=157, y=300)

    root.mainloop()

main()