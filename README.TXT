-----------------------------
1) mystery1():
-----------------------------
    a) y = 1

    b) x + mystery(x, y - 1)
    Does simple addition while bringing y closer to the base case

    c) Multiplies x y times



-----------------------------
2) mystery2()
-----------------------------

    a) i = 0

    b) mystery2(i - 1, j + 1)
    Brings i closer to base case while incrementing j (result)

    c) Adds i to j
    
    d) The only way I see of there being infinite recursion is if i were
    inputted as a negative number, since it would never meet the base
    case. I would switch said base case to i <= 0 so that it stops regardless
    of if i is negative.

    

-----------------------------
3) mystery3()
-----------------------------
    a) pos is at the last element in list

    b) mystery3(ls, pos - 1)
    ls remains the same while pos gets closer to its base case

    c) Finds the smallest number to the right of indicated position

    d) Pos indicates the start of where we want to check the list. If it's negative,
    it's gonna start pulling null values. If it's beyond the list size, then
    we've got an infinite loop since it'll reach the last element
    
    
-----------------------------
4) mystery4()
-----------------------------
    a) b <= 1

    b) mystery4(a * a, b / 2)
    I'm actually unsure since it's written in so many spots, but I think it's
    about this, since b is getting closer to its base case while a is getting
    bigger and bigger by multiplying with itself

    c) Took me a sec, but calculates a to the power of b

