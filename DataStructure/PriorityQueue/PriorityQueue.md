## Priority Queue

### Introduction

우선순위 큐는 트리와 밀접하게 연관된 자료구조이다. 우선순위 큐는 말 그대로 큐는 큐인데 큐에 들어있는 원소들 간에 우선순위가 존재하는 큐이다. 다시 말하면, 일반적인 큐는 FIFO의 특성에 따라 가장 먼저 입력된 자료가 가장 먼저 큐에서 꺼내지지만, 우선순위 큐에서 가장 먼저 꺼내지는 자료는 **큐에 들어온 순서에 관계없이 우선순위가 가장 높은 자료** 이다. 

### 우선순위 큐 사용법

이러한 우선순위 큐를 어떻게 구현해야 할까? 우선순위 큐를 구현하는 방법은 배열이나 연결리스트를 이용하거나 이진 검색 트리를 이용하는 방법과 같이 여러가지 방법이 있지만 그 중에서도 가장 단순하게 구현하는 방법은 바로 힙(heap)을 이용해 구현하는 것이다.


힙(heap) 은 트리의 한 종류로 가장 큰 원소를 찾는 데 최적화된 형태의 이진 트리로, 힙을 사용하면 새 원소를 추가하는 연산과 가장 큰 원소를 꺼내는 연산을 모두 O(lgN) 시간에 수행할 수 있다. 힙을 사용해서 우선순위 큐를 구현하는 방법은 우선순위와 실제 자료의 쌍을 담는 힙( *마치 key와 value* )을 만들고, 대소 관계를 비교할 때는 우선순위를 비교하도록 하면 된다. 


C++ 에서는 힙(heap)을 이용해서 우선순위 큐를 구현해야 하지만 Java 에서는 편리하게도 표준라이브러리로 `PriorityQueue` 를 제공하고 있다. 그러므로 힙에 대한 자세한 이해는 다음으로 미뤄두고 Java 에서 제공되는 `PriorityQueue`의 사용법에 대해 간단하게 정리 해보겠다. 

```
import java.util.PriorityQueue;
import java.util.Random;

public class PriorityQueueExample {
    private void sortNumbers() {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        Random rand = new Random();
        for(int i=0; i < 10; i++){
            queue.add(rand.nextInt(100));
        }

        while(!queue.isEmpty()) {
            System.out.print("%d", queue.remove());
        }
    }
}
```

위 코드의 출력결과는 크기 순서대로 정렬된 정수들이다. priority queue 의 자료형이 `int` 일 때는 일반적인 정수의 크기 순서가 default 로 설정된 우선순위이다. 이 우선순위에 따라 queue 에 자료들을 집어넣는다. 자료형이 `int` 형이 아니고 `String` 일 경우에는 정렬과 마찬가지로 `Comparator` 인터페이스를 이용해 우선순위를 결정하는 방식을 직접 정해주어야 한다.


참고 : http://farenda.com/java/java-priorityqueue-by-example/


알고리즘 문제해결 전략