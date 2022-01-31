import re

emailTests = ['artyom0104@gmail.com', 'pupalupa', 's339052@niuitmo.ru',
              'dima_1912@yandex', 'se.ifmo.ru', 'VaNya2010@outlook.com']

emailCheck = r'[a-z0-9_.]+@[a-z]+\.[a-z]+'
i = 0
for test3 in emailTests:
    i += 1
    emailMatch = re.fullmatch(emailCheck, test3, re.IGNORECASE)
    if emailMatch:
        emailServer = re.split('@', test3)[1]
        print(f'Тестовый email {i}: {emailServer}')
    else:
        print(f'Тестовый email {i}: Fail!')
