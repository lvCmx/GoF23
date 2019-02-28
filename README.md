# java版 23种设计模式+案例详解

## 设计模式6大原则
单一职责原则：就一个类而言，应该仅有一个引起它变化的原因； 通俗的说，即一个类只负责一项职责
开放-封闭原则：对扩展开放、对修改关闭
依赖倒转原则：高层模块不应该依赖低层模块。两个都应该依赖抽象。换言之，要针对接口编程，而不是针对实现编程。
里氏代换原则：所有引用基类（父类）的地方必须能透明地使用其子类的对象。
接口隔离原则：使用多个专门的接口，而不使用单一的总接口，即客户端不应该依赖那些它不需要的接口。
迪米特法则：一个软件实体应当尽可能少地与其他实体发生相互作用。

## 23种设计模式的分类
创建型模式：主要用于创建对象，描述怎么创建对象，它的特点是将对象的创建与使用分离。主要包括：<a href="https://github.com/lvCmx/GoF23/blob/master/src/com/sxl/GoF/singleton/%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F.md">单例模式</a>、原型模式、工厂方法、抽象工厂、建造者模式
结构型模式：创建了对象之后，对象的组成以及对象之间的依赖关系就可以重点，因为对象的结构、继承和依赖关系会影响到后续的维护性、代码的健壮性。主要包括：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式
行为型模式：在对象的结构和对象的创建问题都解决了之后，就剩下对象的行为问题了，如果对象的行为设计的好，那么对象的行为就会更清晰，它们之间的协作效率就会提高。主要包括：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式

## 23种设计模式功能概要
单例模式(Singleton)：顾名思义就是一个类只创建一个对象，该类提供全局的访问点供外获取实例。
