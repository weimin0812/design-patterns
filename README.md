# design-patterns
Design patterns implemented in Java.


https://www.tutorialspoint.com/design_pattern/index.htm

# Decorator Pattern

## Definition
Decorator pattern allows a user to add new functionality to an existing object without altering its structure.

This type of design pattern comes under structural pattern as this pattern acts a wrapper to existing class.

This pattern creates a decorator class which wraps the original class and provides additional functionality keeping class methods signature intact.

## Implementation

We are demonstrating the use of decorator pattern via following example in which we will decorator a shape with some color without alter shape class.

We are gonging to create a Shape interface and concrete classes implementing the Shape interface.
 
We will then create an abstract decorator class ShapeDecorator implementing the Shape interface and having Shape object as its instance variable.

RedShapeDecorator is concrete class implementing ShapeDecorator.

DecoratorPatterDemo, our demo class will use RedShapeDecorator to decorate Shape objects.

# 装饰者模式

## 定义
装饰者模式允许用户在不改变其结构的前提下向现有对象添加新功能。
 
这类设计模式属于结构模式，因为此模式是现有类的包装器。

此模式创建一个装饰器类，它包装原始类并提供其他功能，使类方法签名保持不变。

## 实现

我们通过以下示例来展示装饰器模式的用法，其中我们将给形状类装饰上颜色而不改变形状类。

首先：我们将会创建一个Shape接口，以及Shape接口的具体实现类。

然后，我们创建一个抽象装饰器类ShapeDecorator，它实现了Shape接口并包含一个Shape类型的实例。

ShapeDecorator的具体实现类RedShapeDecorator。

DecoratorPatterDemo我们将会用RedShapeDecorator去装饰Shape对象。
 
 
# Factory Pattern

## Definition

Factory pattern is one of the most used design patterns in Java.

This type of design pattren comes under creationsl pattern as this pattern provides one of the best ways to create an object.

In Factory Pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

## Implementation

We are going to create a Shape interface and concrete classes implementing the Shape interface.

A factory class ShapeFactory is defined as a next step.

FactoryPatternDemo, our demo class will use ShapeFactory to get a Shape object.

It will pass information (CIRCLE / RECTANGLE / SQUARE) to ShapeFactory to get the type of object it needs.

# Abstract Factory Pattern

## Definition

Abstract Factory patterns work around a super-factory which creates other factories.

This factory is also called as factory of factories

This type of design pattern comes under creational pattern as this pattern provides one of the best way to create an object.

In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes.

Each generated factory can give the objects as per the Factory Pattern.

## Implementation

We are going to create a Shape and Color interfaces and concrete classes implementing these interfaces.

We create an abstract factory class AbstractFactory as next step.

Factory classes ShapeFactory and ColorFactory are defined where each factory extends AbstractFactory.

A factory creator/generator class FactoryProducer is created.

AbstractFactoryPatternDemo, our demo class uses FactoryProducer to get a AbstractFactory object.

It will pass information (CIRCLE/ RECTANGLE/ SQUARE for Shape) to AbstractFactory to get the type of object it needs.

It will pass information (RED/ GREEN/ BLUE for Color) to AbstractFactory to get the type of object it needs.

# Singleton Pattern

## Definition

Singleton pattern is one of the simplest design patterns in Java.

This type of design pattern comes under creational pattern as this pattren provides one of teh best ways to create an object.

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created.

This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

## Implementation

We're going to create a SingleObject class.

SingleObject class have its constructor as private and have a static instance of itself.

SingleObject class provides a static method to gwt its static instance to outside world.

SingletonPatternDemo, our demo class will use SingleObject class to get a SingleObject object.






