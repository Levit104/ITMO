import time
# модуль для работы со временем
import re
# модуль для работы с регулярными выражениями

startTime = time.perf_counter()
# начало отсчёта времени

with open('timetable.yml', encoding='utf-8') as inputFile:
    yamlFile = inputFile.readlines()

subjects = []; teachers = []; times = []; classrooms = []; locations = []; weeks = []; formats = []
# списки, где будут лежать элементы расписания (названия предметов в subjects, адреса в locations и т.д.)
lessons = []
# список, где лежит кол-во пар

for line in yamlFile:
    line = line.replace('  ', '').replace('\n', '').replace(' ', '', 1).replace('"', '')
    if re.search(r'subject', line):
        line = re.sub(r'\w+:', '', line)
        subjects.append(line)
    if re.search(r'teacher', line):
        line = re.sub(r'\w+:', '', line)
        teachers.append(line)
    if re.search(r'time:', line):
        line = re.sub(r'\w+:', '', line, 1)
        times.append(line)
    if re.search(r'classroom', line):
        line = re.sub(r'\w+:', '', line)
        classrooms.append(line)
    if re.search(r'location', line):
        line = re.sub(r'\w+:', '', line)
        locations.append(line)
    if re.search(r'week', line):
        line = re.sub(r'\w+:', '', line)
        weeks.append(line)
    if re.search(r'format', line):
        line = re.sub(r'\w+:', '', line)
        formats.append(line)
    if re.search(r'lesson\d', line):
        line = re.sub(r':', '', line)
        lessons.append(line)

xmlFile = '<timetable>\n\t<tuesday>\n\t\t'
for n in range(len(lessons)):
    xmlFile += f'<{lessons[n]}>\n\t\t\t'
    xmlFile += f'<subject>{subjects[n]}</subject>\n\t\t\t'
    xmlFile += f'<teacher>{teachers[n]}</teacher>\n\t\t\t'
    xmlFile += f'<time>{times[n]}</time>\n\t\t\t'
    xmlFile += f'<classroom>{classrooms[n]}</classroom>\n\t\t\t'
    xmlFile += f'<location>{locations[n]}</location>\n\t\t\t'
    xmlFile += f'<week>{weeks[n]}</week>\n\t\t\t'
    xmlFile += f'<format>{formats[n]}</format>\n\t\t'
    # xml += f'</{lessons[n]}>\n\t\t'
    if n == len(lessons) - 1:
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