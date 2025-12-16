void main() {
  LinkedList ll = new LinkedList();

  ll.isEmpty();
  ll.addFirst("Mag");
  System.out.println(ll);
  ll.addLast("Alan");
  System.out.println(ll);
  ll.addLast("George");
  System.out.println(ll);
  ll.addFirst("Joe");
  System.out.println(ll);
  System.out.println(ll.get(1));
  System.out.println(ll.contains("George"));
  System.out.println(ll.indexOf("Joe"));


//  System.out.println(ll.removeLast());
//  System.out.println(ll);
//  System.out.println(ll.removeFirst());
//  System.out.println(ll);
//  System.out.println(ll.size());
//  ll.clear();
//  System.out.println(ll);


}
