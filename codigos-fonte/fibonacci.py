def fibonacci(termos: int):
    a = 0
    b = 1
    ac = 0
    for idx in range(0, termos):
        print(a)
        ac = a + b
        a = b
        b = ac
    return None

fibonacci(64)
