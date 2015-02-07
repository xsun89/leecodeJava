package leecode.knockgate;

import java.util.Stack;

/**
 * Created by sun38 on 2/6/2015.
 */
public class queueUseStack {
    public static class TwoStacksImplementQueue {
        public static Stack<Integer> stackPush;
        public static Stack<Integer> stackPop;

        public TwoStacksImplementQueue() {
            stackPush = new Stack<Integer>();
            stackPop = new Stack<Integer>();
        }

        public void add(int pushInt) {
            stackPush.push(pushInt);
        }

        public int poll() {
            if (stackPop.empty() && stackPush.empty()) {
                throw new RuntimeException("Queue is empty!");
            } else if (stackPop.empty()) {
                while (!stackPush.empty()) {
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.pop();
        }

        public int peek() {
            if (stackPop.empty() && stackPush.empty()) {
                throw new RuntimeException("Queue is empty!");
            } else if (stackPop.empty()) {
                while (!stackPush.empty()) {
                    stackPop.push(stackPush.pop());
                }
            }
            return stackPop.peek();
        }
    }

    public static void main(String[] args){
        TwoStacksImplementQueue test = new TwoStacksImplementQueue();
        test.add(1);
        test.add(2);
        test.add(3);

    }

}
