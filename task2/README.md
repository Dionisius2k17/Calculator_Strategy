# Calculator_Strategy

Реализация простейшего калькулятора с использованием шаблона проектирования (паттерна) "Стратегия".

## Как использовать
Калькулятор реализован двумя способами представления - терминальный (консольный) и оконный. После запуска будет предложено запустить один из этих методов или выйти из приложения. 
Если будет введено число 1 - будем работать в консоли.

Если будет введено число 2 - откроется отдельное окно, которое будет представлять собой 6 кнопок, 2 поля ввода и одно текстовое поле, которое будет выдавать результат и использованную операцию.

Если будет введено число 0 - выйдем из приложения, и оно вернет 0

Если будет введено любой другой символ - выйдем из приложения, и оно также вернет 0.

Каждый из способов представляет собой простейший калькулятор, реализовывающий операции сложения, вычитания, умножения, деления и нахождения остатка от деления.

Консольное (терминальное) представление кода подразумевает введение двух чисел и операции, которая над ними будет проведена, с клавиатуры.

Графическая версия калькулятора представляет собой 6 кнопок - операции сложения, вычитания, умножения, деления и нахождения остатка от деления, а кнопка со знаком "равно" (=) отвечает за получение результата и выведение его в окно.
