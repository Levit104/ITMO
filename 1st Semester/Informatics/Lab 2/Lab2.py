while True:
    digits = input('Введите набор из 7 цифр «0» и «1»: ')

    if len(digits) == 7:
        for n in range(len(digits)):
            if digits[n] in '01' and digits[n+1] in '01':
                r1 = int(digits[0]); r2 = int(digits[1]); r3 = int(digits[3])
                i1 = int(digits[2]); i2 = int(digits[4]); i3 = int(digits[5]); i4 = int(digits[6])
                s1 = r1 ^ i1 ^ i2 ^ i4
                s2 = r2 ^ i1 ^ i3 ^ i4
                s3 = r3 ^ i2 ^ i3 ^ i4

                print('\nS1 = ', str(r1), '⊕', str(i1), '⊕', str(i2), '⊕', str(i4), '=', str(s1),
                      '\nS2 = ', str(r2), '⊕', str(i1), '⊕', str(i3), '⊕', str(i4), '=', str(s2),
                      '\nS3 = ', str(r3), '⊕', str(i2), '⊕', str(i3), '⊕', str(i4), '=', str(s3), '\n')

                error = int(str(s3) + str(s2) + str(s1), 2)
                if error == 0:
                    print('Ошибок нет')
                else:
                    print('Ошибка в бите', error)
                    correctDigits = []
                    for i in range(len(digits)):
                        if i == error - 1:
                            if digits[i] == "0":
                                correctDigits.append(1)
                            if digits[i] == "1":
                                correctDigits.append(0)
                        else:
                            correctDigits.append(digits[i])

                    print('\nПравильное сообщение: ', end='')
                    for i in correctDigits:
                        print(i, end='')
                    print()  # чтобы отделить от Process finished with exit code
                break
            else:
                print('Ошибка: неверные символы (можно только 0 и 1)')
                break
    else:
        print('Ошибка: введены не 7 цифр и/или неверные символы')

    exit = input('Чтобы завершить работу программы, введите «exit», чтобы продолжить - любой символ: ')
    if exit == 'exit':
        break