import re

smile = 'X-\('
smileTests = ['Мой номер ИСУ 339052, поэтому мой смайлик - X-(.',
              'Мой друг отправил мне X-( X-( X-(.',
              'У тебя ошибка. Правильно X-(, а не X-C.',
              'X-( и X-) - показывают абсолютно разные эмоции.',
              'Мне написали X-C.']
i = 0
for test1 in smileTests:
    i += 1
    smileMatch = re.findall(smile, test1)
    smileCount = len(smileMatch)
    print(f'Текст: {test1} \nКол-во смайликов: {smileCount} \n')