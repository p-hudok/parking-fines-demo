# Список штрафов за неправильную парковку

Данный проект написан с использованием технологий:
- Java
- Spring Boot
- Spring Data
- Postgresql

В этом проекте можно проводить CRUD операции над сущностями-штрафами через веб. Результаты сохранятются в базу данных.

Главная страница проекта: localhost:8080/citizens

Таблица на главной странице проекта содержит информацию о том, кому был выписан штраф, какой датой и выплачен ли он на данный момент. Добавить запись о новом штрафе можно по нажатию кнопки "Добавить новый штраф". Редактировать или удалить информацию о штрафе можно по нажатию кнопок "редактировать" и "удалить" в соответствующей строке таблицы.

![Главная страница](https://github.com/p-hudok/parking-fines-demo/raw/master/src/main/resources/screenshots/main.jpg)

Добавление информации о новом штрафе происходит по адресу localhost:8080/add

![Главная страница](https://github.com/p-hudok/parking-fines-demo/raw/master/src/main/resources/screenshots/add-1.jpg)

![Главная страница](https://github.com/p-hudok/parking-fines-demo/raw/master/src/main/resources/screenshots/add-2.jpg)

Главная страница проекта с добавленным новым штрафом:

![Главная страница](https://github.com/p-hudok/parking-fines-demo/raw/master/src/main/resources/screenshots/add-main.jpg)

Редактирование информации о существующем штрафе происходит по адресу localhost:8080/update

![Главная страница](https://github.com/p-hudok/parking-fines-demo/raw/master/src/main/resources/screenshots/edit-1.jpg)

![Главная страница](https://github.com/p-hudok/parking-fines-demo/raw/master/src/main/resources/screenshots/edit-2.jpg)

Главная страница проекта с отредактированными данными существующего штрафа:

![Главная страница](https://github.com/p-hudok/parking-fines-demo/raw/master/src/main/resources/screenshots/edit-main.jpg)
