package com.producer.first.producer.amqp;

public interface AmqpProducer<T> {
	void producer(T t);
}
