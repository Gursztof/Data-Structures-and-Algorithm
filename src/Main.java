void main() {
  Stack stack = new Stack(3);

  System.out.println(stack);
  System.out.println(stack.isEmpty());
  System.out.println(stack.pop());
  stack.push("Joe");
  stack.push("Magdalena");
  stack.push("Aleksander");
  stack.push("Aleksander1");
  System.out.println(stack.pop());
  System.out.println(stack);
  System.out.println(stack.peek());
  System.out.println(stack.size());
}
