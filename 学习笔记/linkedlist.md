# transient
将不需要序列化的属性前添加关键字transient，序列化对象的时候，这个属性就不会被序列化  
## transient底层实现原理是什么？
java的serialization提供了一个非常棒的存储对象状态的机制，说白了serialization就是把对象的状态存储到硬盘上 去，等需要的时候就可以再把它读出来使用。有些时候像银行卡号这些字段是不希望在网络上传输的，transient的作用就是把这个字段的生命周期仅存于调用者的内存中而不会写到磁盘里持久化，意思是transient修饰的age字段，他的生命周期仅仅在内存中，不会被写到磁盘中。  
## 静态变量能被序列化吗
静态变量是不会被序列化的，即使没有transient关键字修饰。因为静态变量在全局区,本来流里面就没有写入静态变量,我打印静态变量当然会去全局区查找,而我们的序列化是写到磁盘上的，所以JVM查找这个静态变量的值，是从全局区查找的，而不是磁盘上。静态变量不管是不是transient关键字修饰，都不会被序列化。  
# linkedlist
内部本质是双向链表  
```
public int indexOf(Object o) {}  
```
本质也是遍历链表
```
public E get(int index) {
    checkElementIndex(index);
    return node(index).item;
}
Node<E> node(int index) {}  
```
长度大于一半从后向前找，小于一半从前向后找，时间复杂度O(N/2)