package ch07_inter;
public class ExInterface02 {
	public static void main(String[] args) {
		Object t = new Tank();
		Object d = new DropShip();
		Object m = new Marine();
		AsCenter as = new AsCenter();
		as.repair(t);
		as.repair(d);
		as.repair(m);
	}
}
/* 다형성 
 * 매개변수를 인터페이스형으로 사용하는 경우.=>메소드의 사용 조건의 의미로 많이 사용됨.
 */
/*interface Repairable
 *class Unit 
   int hp;
   final int MAX; 
   Unit(int hp)
 *class AirUnit extends Unit
 *class GroundUnit extends Unit
 *class Tank extends GroundUnit implements Repairable 
 * toString() : return "Tank"
 *class DropShip extends AirUnit implements Repairable
 * toString() : return "DropShip"
 *class Marine  extends Unit implements Repairable
 * toString() : return "Marine"
 *
 *class AsCenter
 * void repair(Repairable r)
 */
interface Repairable {}

class Unit { int hp; final int MAX;
   Unit(int hp)  { this.hp=hp;    MAX=hp; }}

class AirUnit extends Unit {
	AirUnit(int hp)  { super(hp); }}

class GroundUnit extends Unit {
	GroundUnit(int hp)  { super(hp);  }}

class Tank extends GroundUnit implements  Repairable {
	Tank()  { super(150);  }
	public String toString()  {  return "Tank"; }}

class DropShip extends AirUnit implements Repairable {
	DropShip()  { super(125);  }
	public String toString()  {  return "DropShip"; }}

class Marine   { 
	public String toString() {  return "Marine";  }}

class AsCenter  { 
	void repair(Object r)  {  if  (r instanceof Repairable) {
		System.out.println(r + "가 수리 되었습니다");  }}
	}



 