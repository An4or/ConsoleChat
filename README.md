"Простой чат с сервером, клиентом и ботом + Минимальный визуальный интерфейс"

Ѕеrvеr - основной класс сервера.
  Handler - вложенный класс, который реализовывает протокол общения с клиентом.
Client - класс, запрашивающий и отправляющий серверу данные.
  SocketThread - внутренний класс, отвечающий за поток, устанавливающий
  сокетное соединение и читающий сообщения сервера.
MessageType - enum, который отвечает за тип сообщений пересылаемых между
клиентом и сервером.
Message - класс, отвечающий за пересылаемые сообщения.
Connection - класс соединения между клиентом и сервером.
ConsoleHelper - вспомогательный класс, для чтения или записи в консоль.
BotClient - дочерний класс Client, добавляет в чат бота.
  BotSocketThread - внутренний клас, аналог SocketThread.
ClientGuiModel - реализация клиента с графическим интерфейсом, отвечает
за (Model в MVC).
ClientGuiView - класс представления (View в MVC), реализован с помощью javax.swing.
  GuiSocketThread  - внутренний класс, работает с моделью.
ClientGuiController - дочерний класс Client (Controller в MVC)

В проекте реализовано следующее:
Работа с сокетами;
Сериализация и десериализация;
Создание многопоточных приложений и их синхронизация;
Применение паттерна MVC;
Использование внутренних и вложенных классов;
Работа с библиотекой Swing;
Применение классов Calendar и SimpleDateFormat

![UML Diagrams](https://github.com/An4or/ConsoleChat/blob/master/Chat_UML.png)
