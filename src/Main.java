void main() {
  Stack stack = new Stack();

  stack.push("Joe");
  System.out.println(stack);
  stack.push("Joe1");
  stack.push("Joe2");
  System.out.println(stack);
  System.out.println(stack.pop());
  System.out.println(stack);
  System.out.println(stack.peek());
  System.out.println(stack.size());


}
