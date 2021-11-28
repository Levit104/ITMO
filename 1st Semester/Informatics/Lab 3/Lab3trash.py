isu = 339052
eyes = [':', ';', 'X', '8', '=']
nose = ['-', '<', '-{', '<{']
mouth = ['(', ')', 'O', '|', '\\', '/', 'P']
smile = eyes[isu % 5] + nose[isu % 4] + mouth[isu % 7]

smileTests = ['Мой номер ИСУ 339052, поэтому мой смайлик - X-(.',
              'Мой друг отправил мне X-( X-( X-(.',
              'У тебя ошибка. Правильно X-(, а не X-C.',
              'X-( и X-) - показывают абсолютно разные эмоции.',
              'Мне написали X-C.']

i = 0
for test1 in smileTests:
    i += 1
    smileCount = test1.count(smile)
    print(f'Текст: {test1} \nКол-во смайликов: {smileCount} \n')


print('\nЗадание 1 (isu % 5 = 2) (isu % 4 = 0) (isu % 7 = 0)')
isu = 339052
testsISU = [338765, 574930, 480483, 648242, 774292]

eyes = [':', ';', 'X', '8', '=']              # isu % 5
nose = ['-', '<', '-{', '<{']                 # isu % 4
mouth = ['(', ')', 'O', '|', '\\', '/', 'P']  # isu % 7

smile = eyes[isu % 5] + nose[isu % 4] + mouth[isu % 7]
smileNumber = str(isu % 5) + str(isu % 4) + str(isu % 7)
print('Мой смайлик под номером ' + smileNumber + ': ' + smile)

i = 0
for test1 in testsISU:
    i += 1
    smile = eyes[test1 % 5] + nose[test1 % 4] + mouth[test1 % 7]
    smileNumber = str(test1 % 5) + str(test1 % 4) + str(test1 % 7)
    print('Тестовый смайлик ' + str(i) + ' под номером ' + smileNumber + ': ' + smile)

print('\nЗадание 2 (isu % 6 = 4)')
text = 'Уважаемые студенты! В эту субботу в 15:00 планируется доп. занятие на 2 часа. ' \
       'То есть в 27:68:01 оно уже точно кончится.'
testsText = ['Я буду дома примерно в 17:10.',
             'Рейс перенесли с 16:30 на 18:00.',
             'Мой часы показывают, что сейчас 14:30:10.',
             'Встреча состоится 03.10 ровно в 13:00.',
             'Я уйду через часа 2, у меня поезд в 19:20.']

timeCheck = r'\d{2}:\d{2}(:\d{2})?'
time = re.sub(timeCheck, '(TBD)', text)
print('Исходный текст: ' + text + '\nИзмененный текст: ' + time + '\n')

i = 0
for test2 in testsText:
    i += 1
    time = re.sub(timeCheck, '(TBD)', test2)
    print('Исходный тест. текст ' + str(i) + ': ' + test2 +
          '\nИзмененный тест. текст ' + str(i) + ': ' + time + '\n')

print('Задание 3 (isu % 4 = 0)')
email = 'artyom0104@gmail.com'
emailTests = ['pupalupa', 's339052@niuitmo.ru', 'dima_1912@yandex', 'se.ifmo.ru', 'VaNya2010@outlook.com']

emailCheck = r'[a-z0-9_.]+@[a-z]+\.[a-z]+'
emailMatch = re.fullmatch(emailCheck, email, re.IGNORECASE)
if emailMatch:
    emailServer = re.split('@', email)[1]
    print('Мой email: ' + emailServer)
else:
    print('Мой email: Fail!')

i = 0
for test3 in emailTests:
    i += 1
    emailMatch = re.fullmatch(emailCheck, test3, re.IGNORECASE)
    if emailMatch:
        emailServer = re.split('@', test3)[1]
        print('Тестовый email ' + str(i) + ': ' + emailServer)
    else:
        print('Тестовый email ' + str(i) + ': ' + 'Fail!')
