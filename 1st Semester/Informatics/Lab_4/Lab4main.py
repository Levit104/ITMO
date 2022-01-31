import time
# модуль для работы со временем

startTime = time.perf_counter()
# начало отсчёта времени

with open('timetable.yml', encoding='utf-8') as inputFile:
    yamlFile = inputFile.readlines()

subjects = []; teachers = []; times = []; classrooms = []; locations = []; weeks = []; formats = []
# списки, где будут лежать элементы расписания (названия предметов в subjects, адреса в locations и т.д.)

for line in yamlFile:
    line = line.replace('  ', '').replace('\n', '').replace(' ', '', 1).replace('"', '')
    # замена всех отступов и переносов строк, а также кавычек (если есть)
    key, value = line.split(':', 1)
    if key == 'subject':
        subjects.append(value)
    if key == 'teacher':
        teachers.append(value)
    if key == 'time':
        times.append(value)
    if key == 'classroom':
        classrooms.append(value)
    if key == 'location':
        locations.append(value)
    if key == 'week':
        weeks.append(value)
    if key == 'format':
        formats.append(value)
    # заполнение списков (элементов расписания)

lessons = []
lessonCount = len(subjects)
for i in range(lessonCount):
    i += 1
    # прибавляем 1, чтобы не было lesson0
    lessons.append(f'lesson{i}')
# счёт кол-ва пар

xmlFile = "<timetable>\n\t<tuesday>\n\t\t"
for n in range(lessonCount):
    xmlFile += f'<{lessons[n]}>\n\t\t\t'
    xmlFile += f'<subject>{subjects[n]}</subject>\n\t\t\t'
    xmlFile += f'<teacher>{teachers[n]}</teacher>\n\t\t\t'
    xmlFile += f'<time>{times[n]}</time>\n\t\t\t'
    xmlFile += f'<classroom>{classrooms[n]}</classroom>\n\t\t\t'
    xmlFile += f'<location>{locations[n]}</location>\n\t\t\t'
    xmlFile += f'<week>{weeks[n]}</week>\n\t\t\t'
    xmlFile += f'<format>{formats[n]}</format>\n\t\t'
    # xml += f'</{lessons[n]}>\n\t\t'
    if n == lessonCount - 1:
        xmlFile += f'</{lessons[n]}>\n\t'
        # если это последняя итерация цикла, то сделать 1 отступ, если нет, то 2
    else:
        xmlFile += f'</{lessons[n]}>\n\t\t'
xmlFile += '</tuesday>\n'
xmlFile += '</timetable>'

with open('timetable.xml', 'w', encoding='utf-8') as outputFile:
    outputFile.write(xmlFile)

endTime = time.perf_counter()
# конец отсчёта времени
finalTime = round(endTime - startTime, 8)
print(f'Время выполнения программы {finalTime} секунд.')