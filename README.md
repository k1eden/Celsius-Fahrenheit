![Build Status](https://github.com/k1eden/Celsius-Fahrenheit/actions/workflows/main.yml/badge.svg?branch=dev) (develop)
![Build Status](https://github.com/k1eden/Celsius-Fahrenheit/actions/workflows/main.yml/badge.svg?branch=main) (main)

# Celsius-Fahrenheit

Software-Engineering-2022

Converter for Celsius temperature <-> Fahrenheit temperature

# Options
    -cl (From Celsius to Farenheit)
    -fh (From Farenheit to Celsius)

# Use

Clone repository:
> https://github.com/k1eden/Celsius-Fahrenheit.git

Go to working directory:
> cd Celsius-Fahrenheit

Build application:
> ./gradlew build

Run application:
> java -jar build/libs/Celsius-Fahrenheit-1.0.jar

# Use (Docker)

Clone repository:
> https://github.com/k1eden/Celsius-Fahrenheit.git

Go to working directory:
> cd Celsius-Fahrenheit

Build image:
> docker build -t app .

![3.png](resources%2F3.png)

Run application:
> docker run app (-cl/-fh) (any double digit)

![1.png](resources%2F1.png)

![2.png](resources%2F2.png)

![4.png](resources%2F4.png)
  