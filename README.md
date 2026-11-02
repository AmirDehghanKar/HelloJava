<div align="center">

# ☕ HelloJava
### مجموعه برنامه‌های تمرینی جاوا

![Java](https://img.shields.io/badge/Java-17%2B-ED8B00?logo=openjdk&logoColor=white)
![VS Code](https://img.shields.io/badge/Editor-VS%20Code-007ACC?logo=visualstudiocode&logoColor=white)
![Status](https://img.shields.io/badge/Status-Active-success)
![Level](https://img.shields.io/badge/Level-Beginner-blue)
![Docs](https://img.shields.io/badge/Docs-English%20%7C%20فارسی-orange)

**[English](#-english) · [فارسی](#-فارسی)**

</div>

---

## 🇬🇧 English

### About

**HelloJava** is a collection of small Java programs written while learning the language. Each file is a standalone console program that practices one core idea: variables and types, input handling, arrays and collections, object-oriented basics, timers, and date/time.

The programs were first written as quick exercises and then **refactored** to follow cleaner practices: validated input, constants instead of magic numbers, `try-with-resources` for `Scanner`, and clear English naming.

### Programs

| File | What it does |
|------|--------------|
| `Age.java` | Reads the ages of three users and prints the oldest and youngest. |
| `Array.java` | Sums an int array, sorts it, and finds a number with binary search. |
| `Bank.java` | A simple bank loan calculator: total profit and monthly payment. |
| `Circle.java` | Calculates the area of a circle from its radius. |
| `Clock.java` | Prints the current system time (`HH:mm:ss`). |
| `CollectionDemo.java` | Basics of `Collection` / `ArrayList`: add, remove, and contains. |
| `TrafficLight.java` | Simulates a traffic light cycle: green → yellow → red. |
| `dog.java` | Object-oriented example: a `Dog` class with fields, a constructor, and actions. |
| `washing_machine.java` | Simulates a washing machine: water level check, then a timed wash cycle. |

### Concepts Practiced

- Variables, data types, and operators
- Conditions and loops
- Reading console input with `Scanner` and validating it
- Arrays, `ArrayList`, and the `Collection` interface
- Classes, objects, fields, constructors, and methods (OOP basics)
- `enum`, `Map`, and constants
- Timing with `Timer` / `Thread.sleep`
- Date and time with `java.time`
- Formatting output with `printf` and `Locale`

### Getting Started

**Requirements:** JDK 17 or newer. Check with:

```bash
java -version
javac -version
```

**Run in VS Code:** install *Extension Pack for Java*, open the project folder (`File → Open Folder`), then open any file and click ▶ **Run** above the `main` method.

**Run from the terminal:**

```bash
# 1. Clone the repository
git clone https://github.com/AmirDehghanKar/HelloJava.git
cd HelloJava

# 2. Compile one program
javac -d out src/Projects/Age.java

# 3. Run it
java -cp out Projects.Age
```

> 💡 Tip: if numbers show up as `???` in the console, your system locale uses non-English digits. The programs use `Locale.US` to avoid this.

### Project Structure

```
HelloJava/
├── README.md
├── .gitignore
└── src/
    ├── module-info.java
    └── Projects/
        ├── Age.java
        ├── Array.java
        ├── Bank.java
        ├── Circle.java
        ├── Clock.java
        ├── CollectionDemo.java
        ├── TrafficLight.java
        ├── dog.java
        └── washing_machine.java
```

### Author

**Amirmohammad Dehghankar** — web designer (WordPress), Python developer, and Java learner who loves progress and building bigger projects step by step.

⭐ If you find this repository useful, feel free to give it a star.

---

## 🇮🇷 فارسی

<div dir="rtl">

### درباره‌ی پروژه

**HelloJava** مجموعه‌ای از برنامه‌های کوچک جاوا است که در مسیر یادگیری این زبان نوشته شده‌اند. هر فایل یک برنامه‌ی کنسولی مستقل است که یک مفهوم اصلی را تمرین می‌کند: متغیرها و انواع داده، دریافت ورودی، آرایه‌ها و کالکشن‌ها، مبانی شیءگرایی، تایمرها و کار با تاریخ و زمان.

این برنامه‌ها ابتدا به‌صورت تمرین سریع نوشته شدند و سپس **بازنویسی و بهینه** شدند تا اصول تمیزتری رعایت شود: اعتبارسنجی ورودی، ثابت‌ها به‌جای اعداد جادویی، استفاده از `try-with-resources` برای `Scanner` و نام‌گذاری روشن انگلیسی.

### برنامه‌ها

| فایل | توضیح |
|------|-------|
| `Age.java` | سن سه کاربر را می‌گیرد و بیشترین و کمترین سن را چاپ می‌کند. |
| `Array.java` | مجموع یک آرایه‌ی عددی را حساب می‌کند، مرتبش می‌کند و با جستجوی دودویی یک عدد را پیدا می‌کند. |
| `Bank.java` | ماشین‌حساب ساده‌ی وام بانکی: سود کل و قسط ماهانه. |
| `Circle.java` | مساحت دایره را از روی شعاع حساب می‌کند. |
| `Clock.java` | زمان فعلی سیستم را به‌صورت `HH:mm:ss` چاپ می‌کند. |
| `CollectionDemo.java` | مبانی `Collection` و `ArrayList`: افزودن، حذف و بررسی وجود عنصر. |
| `TrafficLight.java` | شبیه‌سازی چرخه‌ی چراغ راهنما: سبز ← زرد ← قرمز. |
| `dog.java` | نمونه‌ی شیءگرا: کلاس `Dog` با فیلدها، سازنده و رفتارها. |
| `washing_machine.java` | شبیه‌سازی ماشین لباسشویی: بررسی سطح آب و سپس چرخه‌ی زمان‌دار شستشو. |

### مفاهیم تمرین‌شده

- متغیرها، انواع داده و عملگرها
- شرط‌ها و حلقه‌ها
- دریافت ورودی با `Scanner` و اعتبارسنجی آن
- آرایه، `ArrayList` و رابط `Collection`
- کلاس، شیء، فیلد، سازنده و متد (مبانی OOP)
- `enum`، `Map` و ثابت‌ها
- زمان‌بندی با `Timer` و `Thread.sleep`
- تاریخ و زمان با `java.time`
- قالب‌بندی خروجی با `printf` و `Locale`

### نحوه‌ی اجرا

**پیش‌نیاز:** JDK نسخه‌ی ۱۷ یا بالاتر.

**اجرا در VS Code:** افزونه‌ی *Extension Pack for Java* را نصب کن، پوشه‌ی پروژه را با `File ← Open Folder` باز کن، سپس فایل دلخواه را باز کن و روی ▶ **Run** بالای متد `main` بزن.

**اجرا از ترمینال:** دستورهای بخش انگلیسی بالا (`git clone`، `javac`، `java`) را به همان شکل بزن.

> 💡 نکته: اگر اعداد در کنسول به‌صورت `???` نمایش داده شدند، زبان سیستم از ارقام فارسی استفاده می‌کند. برنامه‌ها با `Locale.US` این مشکل را برطرف کرده‌اند.

### نویسنده

**امیرمحمد دهقانکار** — طراح وب (وردپرس)، برنامه‌نویس پایتون و علاقه‌مند به یادگیری جاوا که عاشق پیشرفت و ساختن پروژه‌های بزرگ‌تر قدم‌به‌قدم است.

⭐ اگر این مخزن به کارت آمد، با دادن یک ستاره حمایت کن.

</div>

---

<div align="center">

Made with Love ❤️

</div>
