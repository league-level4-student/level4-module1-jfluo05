package _06_Snake;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Snake {
	public static final Color SNAKE_COLOR = Color.BLUE;
	public static final int BODY_SIZE = 50;

	private SnakeSegment head;
	private ArrayList<SnakeSegment> snake;

	private Direction currentDirection;

	private boolean canMove = true;

	
	public Snake(Location location) {
		snake = new ArrayList<SnakeSegment>();
		head = new SnakeSegment(location, BODY_SIZE);
		snake.add(head);

		currentDirection = Direction.RIGHT;
		
	}

	public void feed() {
		//1. add a new SnakeSegment object to the snake
		snake.add(new SnakeSegment(snake.get(0).getLocation(), BODY_SIZE));
	}

	public Location getHeadLocation() {
		//2. return the location of the snake's head
		return head.getLocation();
	}

	public void update() {
		//1. use a switch statement to check on the currentDirection
		//   of the snake 
		//and calculate its next x and y position.
	

		//2. Iterate through the SnakeSegments in reverse order
		//2a. Update each snake segment to the location of the segment 
		//    in front of it.
	
	Location headLoc= head.getLocation();
	int x=0;
	int y=0;
		//3. set the location of the head to the new location calculated in step 1
		switch(currentDirection) {
		
		case UP: 
			//headLoc.
			y--;
			System.out.println("UP");
			break;
		case DOWN: 
			//headLoc.
			y++;
			System.out.println("DOWN");
			break;
		case LEFT: 
			//headLoc.
			x--;
			System.out.println("LEFT");
			break;
		case RIGHT: 
			//headLoc.
			x++;
			System.out.println("RIGHT");
			break;
		default: 
			System.out.println("ERROR");
			break;
		}
		System.out.println(headLoc.x);
		System.out.println(head.getLocation().x);

	for (int i = snake.size()-1; i > 0; i--) {
			SnakeSegment seg=snake.get(i);
			seg.setLocation(snake.get(i-1).getLocation());
		
		}
	
	Location loc= new Location (head.getLocation().x+x,head.getLocation().y+y);
	head.setLocation(loc);
		//4. set canMove to true
		canMove=true;
		
		isOutOfBounds();
	}

	public void setDirection(Direction d) {
		//1. set the current direction equal to the passed in Direction only if canMove is true.
		//   set canMove equal to false.
		//   make sure the snake cannot completely reverse directions.
	
			
			if(d==Direction.DOWN && currentDirection==Direction.UP) {
				return;
			}else if(d==Direction.UP && currentDirection==Direction.DOWN) {
				return;
			}else if(d==Direction.LEFT && currentDirection==Direction.RIGHT) {
				return;
			}else if(d==Direction.RIGHT && currentDirection==Direction.LEFT) {
				return;
			}
			
			if(canMove) {
			currentDirection=d;
			canMove=false;
		}
	}

	public void reset(Location loc) {
		//1. clear the snake
		snake.clear();
		//2. set the location of the head
		
		head.setLocation(new Location (_00_SnakeGame.WINDOW_WIDTH/2,_00_SnakeGame.WINDOW_HEIGHT/2));
		
		//3. add the head to the snake
		snake.add(head);
		
	}

	public void isOutOfBounds() {
		//1. complete the method so it returns true if the head of the snake is outside of the window
		//   and false otherwise
		Location headLoc=head.getLocation();
	
		
		if(headLoc.x<0 ) {
			headLoc.x= _00_SnakeGame.WIDTH;
		
//					.setLocation(new Location(_00_SnakeGame.WINDOW_WIDTH, headLoc.y));
		} if(headLoc.x>_00_SnakeGame.WIDTH) {
			System.out.println("Just go left");
			//head.setLocation(new Location(0, headLoc.y));
			headLoc.x= 1;
			
		}if(headLoc.y<0) {
		//	head.setLocation(new Location( headLoc.x,_00_SnakeGame.WINDOW_HEIGHT));
			headLoc.y= _00_SnakeGame .HEIGHT;
			
		}if(headLoc.y>_00_SnakeGame.HEIGHT) {
		//	head.setLocation(new Location(headLoc.x,0));
			headLoc.y=1;
		}
	
	}
	
	public boolean isHeadCollidingWithBody() {
		//1. complete the method so it returns true if the head is located
		//   in the same location as any other body segment
		Location headLoc2=head.getLocation();
	
		for (int i = 0; i < snake.size(); i++) {
		Location snake1=snake.get(i).getLocation();
		
		if(headLoc2.x==snake1.x && headLoc2.y==snake1.y) {
			return true;
		}
			
		}
		return false;
	}

	public boolean isLocationOnSnake(Location loc) {
		//1. complete the method so it returns true if the passed in
		//   location is located on the snake
		for (int i = 0; i < snake.size(); i++) {
			if(snake.get(i).getLocation().equals(loc)) {
				return true;
			
			}
			
		}
		return false;
	}

	public void draw(Graphics g) {
		for (SnakeSegment s : snake) {
			s.draw(g);
		}
	}
}
