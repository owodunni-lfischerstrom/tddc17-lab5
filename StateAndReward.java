public class StateAndReward {
	
	public static final int TRY_ONE 	= 0;
	public static final int TRY_TWO 	= 1;
	public static final int TRY_ONLY_ANGLE 	= 2;
	public static final int TRY_ONLY_SPEED 	= 3;
	
	public static int CURRENT_TRY = TRY_ONLY_ANGLE;
	
	public static String getStateAngle(double angle, double vx, double vy) {
		switch(CURRENT_TRY) {
		case TRY_ONE:
			return getStateAngleOne(angle,vx,vy);
		case TRY_TWO:
			return getStateAngleTwo(angle,vx,vy);
		case TRY_ONLY_ANGLE:
			return getStateAngleThree(angle,vx,vy);
		case TRY_ONLY_SPEED:
			return getStateAngleFour(angle,vx,vy);
		}
		return null;
		
	}
	
	/* State discretization function for the angle controller */
	public static String getStateAngleOne(double angle, double vx, double vy) {

		/* TODO: IMPLEMENT THIS FUNCTION */

		String state = "UndefinedState";
		
		/*
		 
		 Defines the state based on the angle
		 
					 		     -.3 G .3
					 		A	   \  /			B
					 				\/
					 -1.5 -------------------	 1.5
					  				|		
					  		D		|		C
					  				?
		 */
		if(angle <= -0.3 && angle > -1.5) {
			// State A
			state = "STATE-A";
		} else if(angle > 0.3 && angle < 1.5) {
			// State B
			state = "STATE-B";
		} else if(angle > -0.3 && angle <= 0.3) {
			// Goal State
			state = "STATE-G";
		} else if(angle >= 1.5) {
			// State C
			state = "STATE-C";
		} else {
			// State D
			state = "STATE-D";
		}
		
		
		return state;
	}

	
	/* State discretization function for the angle controller */
	public static String getStateAngleTwo(double angle, double vx, double vy) {

		/* TODO: IMPLEMENT THIS FUNCTION */

		String state = "UndefinedState";
		
		if(angle <= -2.5) {
			state = "STATE-A";
		} else if(angle > -2.5 && angle <= -2) {
			state = "STATE-B";
		} else if(angle > -2 && angle <= -1.5) {
			state = "STATE-C";
		} else if(angle > -1.5 && angle <= -1) {
			state = "STATE-D";
		} else if(angle > -1 && angle <= -.5) {
			state = "STATE-E";
		} else if(angle > -.5 && angle <= -.25) {
			state = "STATE-F";
		} else if(angle > -.25 && angle <= .25) {
			state = "STATE-G";
		} else if(angle > .25 && angle <= .5) {
			state = "STATE-H";
		} else if(angle > .5 && angle <= 1) {
			state = "STATE-I";
		} else if(angle > 1 && angle <= 1.5) {
			state = "STATE-J";
		} else if(angle > 1.5 && angle <= 2) {
			state = "STATE-K";
		} else if(angle > 2 && angle <= 2.5) {
			state = "STATE-L";
		} else if(angle > 2.5 ) {
			state = "STATE-M";
		} else {
			state = "BUG";
		}
		
		/*
		 
		 Defines the state based on the vx
		 
		 */
		if(vx < -10) {
			state += "-x_-10";
		} else if(vx >= -10 && vx < -5) {
			state += "-x_-5";
		} else if (vx >= -5 && vx < -4) {
			state += "-x_-4";
		} else if (vx >= -4 && vx < -3) {
			state += "-x_-3";
		} else if (vx >= -3 && vx < -2) {
			state += "-x_-2";
		} else if (vx >= -2 && vx < -1) {
			state += "-x_-1";
		} else if (vx >= -1 && vx < -.5) {
			state += "-x_-.5";
		} else if (vx >= -.5 && vx < .5) {
			state += "-x_goal";
		} else if (vx >= .5 && vx < 1) {
			state += "-x_.5";
		} else if (vx >= 1 && vx < 2) {
			state += "-x_1";
		} else if (vx >= 2 && vx < 3) {
			state += "-x_2";
		} else if (vx >= 3 && vx < 4) {
			state += "-x_3";
		} else if (vx >= 4 && vx < 5) {
			state += "-x_4";
		} else if (vx >= 5 && vx < 10) {
			state += "-x_5";
		} else if (vx >= 10) {
			state += "-x_10";
		}
		
		if(vy < -10) {
			state += "-y_-10";
		} else if(vy >= -10 && vy < -5) {
			state += "-y_-5";
		} else if (vy >= -5 && vy < -4) {
			state += "-y_-4";
		} else if (vy >= -4 && vy < -3) {
			state += "-y_-3";
		} else if (vy >= -3 && vy < -2) {
			state += "-y_-2";
		} else if (vy >= -2 && vy < -1) {
			state += "-y_-1";
		} else if (vy >= -1 && vy < -.5) {
			state += "-y_-.5";
		} else if (vy >= -.5 && vy < .5) {
			state += "-y_goal";
		} else if (vy >= .5 && vy < 1) {
			state += "-y_.5";
		} else if (vy >= 1 && vy < 2) {
			state += "-y_1";
		} else if (vy >= 2 && vy < 3) {
			state += "-y_2";
		} else if (vy >= 3 && vy < 4) {
			state += "-y_3";
		} else if (vy >= 4 && vy < 5) {
			state += "-y_4";
		} else if (vy >= 5 && vy < 10) {
			state += "-y_5";
		} else if (vy >= 10) {
			state += "-y_10";
		}
		
		return state;
	}

	
	/* State discretization function for the angle controller */
	public static String getStateAngleThree(double angle, double vx, double vy) {

		/* TODO: IMPLEMENT THIS FUNCTION */

		String state = "UndefinedState";
		
		if(angle <= -2.5) {
			state = "STATE-A";
		} else if(angle > -2.5 && angle <= -2) {
			state = "STATE-B";
		} else if(angle > -2 && angle <= -1.5) {
			state = "STATE-C";
		} else if(angle > -1.5 && angle <= -1) {
			state = "STATE-D";
		} else if(angle > -1 && angle <= -.5) {
			state = "STATE-E";
		} else if(angle > -.5 && angle <= -.25) {
			state = "STATE-F";
		} else if(angle > -.25 && angle <= .25) {
			state = "STATE-G";
		} else if(angle > .25 && angle <= .5) {
			state = "STATE-H";
		} else if(angle > .5 && angle <= 1) {
			state = "STATE-I";
		} else if(angle > 1 && angle <= 1.5) {
			state = "STATE-J";
		} else if(angle > 1.5 && angle <= 2) {
			state = "STATE-K";
		} else if(angle > 2 && angle <= 2.5) {
			state = "STATE-L";
		} else if(angle > 2.5 ) {
			state = "STATE-M";
		} else {
			state = "BUG";
		}
		
		return state;
	}

	/* State discretization function for the angle controller */
	public static String getStateAngleFour(double angle, double vx, double vy) {

		/* TODO: IMPLEMENT THIS FUNCTION */

		String state = "UndefinedState";
				
		/*
		 
		 Defines the state based on the vx
		 
		 */
		if(vx < -10) {
			state += "-x_-10";
		} else if(vx >= -10 && vx < -5) {
			state += "-x_-5";
		} else if (vx >= -5 && vx < -4) {
			state += "-x_-4";
		} else if (vx >= -4 && vx < -3) {
			state += "-x_-3";
		} else if (vx >= -3 && vx < -2) {
			state += "-x_-2";
		} else if (vx >= -2 && vx < -1) {
			state += "-x_-1";
		} else if (vx >= -1 && vx < -.5) {
			state += "-x_-.5";
		} else if (vx >= -.5 && vx < .5) {
			state += "-x_goal";
		} else if (vx >= .5 && vx < 1) {
			state += "-x_.5";
		} else if (vx >= 1 && vx < 2) {
			state += "-x_1";
		} else if (vx >= 2 && vx < 3) {
			state += "-x_2";
		} else if (vx >= 3 && vx < 4) {
			state += "-x_3";
		} else if (vx >= 4 && vx < 5) {
			state += "-x_4";
		} else if (vx >= 5 && vx < 10) {
			state += "-x_5";
		} else if (vx >= 10) {
			state += "-x_10";
		}
		
		if(vy < -10) {
			state += "-y_-10";
		} else if(vy >= -10 && vy < -5) {
			state += "-y_-5";
		} else if (vy >= -5 && vy < -4) {
			state += "-y_-4";
		} else if (vy >= -4 && vy < -3) {
			state += "-y_-3";
		} else if (vy >= -3 && vy < -2) {
			state += "-y_-2";
		} else if (vy >= -2 && vy < -1) {
			state += "-y_-1";
		} else if (vy >= -1 && vy < -.5) {
			state += "-y_-.5";
		} else if (vy >= -.5 && vy < .5) {
			state += "-y_goal";
		} else if (vy >= .5 && vy < 1) {
			state += "-y_.5";
		} else if (vy >= 1 && vy < 2) {
			state += "-y_1";
		} else if (vy >= 2 && vy < 3) {
			state += "-y_2";
		} else if (vy >= 3 && vy < 4) {
			state += "-y_3";
		} else if (vy >= 4 && vy < 5) {
			state += "-y_4";
		} else if (vy >= 5 && vy < 10) {
			state += "-y_5";
		} else if (vy >= 10) {
			state += "-y_10";
		}
		
		return state;
	}

	
	
	
	public static double getRewardAngle(double angle, double vx, double vy) {
		switch(CURRENT_TRY) {
		case TRY_ONE:
			return getRewardAngleOne(angle,vx,vy);
		case TRY_TWO:
			return getRewardAngleTwo(angle,vx,vy);
		case TRY_ONLY_ANGLE:
			return getRewardAngleThree(angle,vx,vy);
		case TRY_ONLY_SPEED:
			return getRewardAngleFour(angle,vx,vy);
		}
		return 0;
	}
	
	/* Reward function for the angle controller */
	public static double getRewardAngleOne(double angle, double vx, double vy) {

		/* TODO: IMPLEMENT THIS FUNCTION */
		
		double reward = 0;
		
		if(angle <= -0.3 && angle > -1.5) {
			// State A
			reward += 1;
		} else if(angle > 0.3 && angle < 1.5) {
			// State B
			reward += 1;
		} else if(angle > -0.3 && angle <= 0.3) {
			// Goal State
			reward = 10;
		} else if(angle >= 1.5) {
			// State C
			
		} else {
			// State D
			
		}
		
		return reward;
	}

	/* Reward function for the angle controller */
	public static double getRewardAngleTwo(double angle, double vx, double vy) {

		/* TODO: IMPLEMENT THIS FUNCTION */
		
		double reward = 0;
		
		if(angle <= -2.5) {
			reward = 0;
		} else if(angle > -2.5 && angle <= -2) {
			reward = 1;
		} else if(angle > -2 && angle <= -1.5) {
			reward = 2;
		} else if(angle > -1.5 && angle <= -1) {
			reward = 4;
		} else if(angle > -1 && angle <= -.5) {
			reward = 8;
		} else if(angle > -.5 && angle <= -.25) {
			reward = 16;
		} else if(angle > -.25 && angle <= .25) {
			reward = 32;
		} else if(angle > .25 && angle <= .5) {
			reward = 16;
		} else if(angle > .5 && angle <= 1) {
			reward = 8;
		} else if(angle > 1 && angle <= 1.5) {
			reward = 4;
		} else if(angle > 1.5 && angle <= 2) {
			reward = 2;
		} else if(angle > 2 && angle <= 2.5) {
			reward = 1;
		} else if(angle > 2.5 ) {
			reward = 0;
		}
		
		if(vx < -10) {
			reward += 0;
		} else if(vx >= -10 && vx < -5) {
			reward += 1;
		} else if (vx >= -5 && vx < -4) {
			reward += 2;
		} else if (vx >= -4 && vx < -3) {
			reward += 3;
		} else if (vx >= -3 && vx < -2) {
			reward += 4;
		} else if (vx >= -2 && vx < -1) {
			reward += 5;
		} else if (vx >= -1 && vx < -.5) {
			reward += 6;
		} else if (vx >= -.5 && vx < .5) {
			reward += 10;
		} else if (vx >= .5 && vx < 1) {
			reward += 6;
		} else if (vx >= 1 && vx < 2) {
			reward += 5;
		} else if (vx >= 2 && vx < 3) {
			reward += 4;
		} else if (vx >= 3 && vx < 4) {
			reward += 3;
		} else if (vx >= 4 && vx < 5) {
			reward += 2;
		} else if (vx >= 5 && vx < 10) {
			reward += 1;
		} else if (vx >= 10) {
			reward += 0;
		}
		
		if(vy < -10) {
			reward += 2;
		} else if(vy >= -10 && vy < -5) {
			reward += 3;
		} else if (vy >= -5 && vy < -4) {
			reward += 4;
		} else if (vy >= -4 && vy < -3) {
			reward += 5;
		} else if (vy >= -3 && vy < -2) {
			reward += 6;
		} else if (vy >= -2 && vy < -1) {
			reward += 7;
		} else if (vy >= -1 && vy < -.5) {
			reward += 8;
		} else if (vy >= -.5 && vy < .5) {
			reward += 12;
		} else if (vy >= .5 && vy < 1) {
			reward += 8;
		} else if (vy >= 1 && vy < 2) {
			reward += 7;
		} else if (vy >= 2 && vy < 3) {
			reward += 6;
		} else if (vy >= 3 && vy < 4) {
			reward += 5;
		} else if (vy >= 4 && vy < 5) {
			reward += 4;
		} else if (vy >= 5 && vy < 10) {
			reward += 3;
		} else if (vy >= 10) {
			reward += 2;
		}

		return reward;
	}
	
	
	/* Reward function for the angle controller */
	public static double getRewardAngleThree(double angle, double vx, double vy) {

		/* TODO: IMPLEMENT THIS FUNCTION */
		
		double reward = 0;
		
		if(angle <= -2.5) {
			reward = 0;
		} else if(angle > -2.5 && angle <= -2) {
			reward = 1;
		} else if(angle > -2 && angle <= -1.5) {
			reward = 2;
		} else if(angle > -1.5 && angle <= -1) {
			reward = 4;
		} else if(angle > -1 && angle <= -.5) {
			reward = 16;
		} else if(angle > -.5 && angle <= -.25) {
			reward = 32;
		} else if(angle > -.25 && angle <= .25) {
			reward = 64;
		} else if(angle > .25 && angle <= .5) {
			reward = 32;
		} else if(angle > .5 && angle <= 1) {
			reward = 16;
		} else if(angle > 1 && angle <= 1.5) {
			reward = 4;
		} else if(angle > 1.5 && angle <= 2) {
			reward = 2;
		} else if(angle > 2 && angle <= 2.5) {
			reward = 1;
		} else if(angle > 2.5 ) {
			reward = 0;
		}
		
		

		return reward;
	}
	
	/* Reward function for the angle controller */
	public static double getRewardAngleFour(double angle, double vx, double vy) {

		/* TODO: IMPLEMENT THIS FUNCTION */
		
		double reward = 0;
		
		if(vx < -10) {
			reward += 0;
		} else if(vx >= -10 && vx < -2) {
			reward += 1;
		} else if (vx >= -2 && vx < -1) {
			reward += 2;
		} else if (vx >= -1 && vx < -.8) {
			reward += 3;
		} else if (vx >= -.8 && vx < -.6) {
			reward += 4;
		} else if (vx >= -.6 && vx < -.4) {
			reward += 5;
		} else if (vx >= -.4 && vx < -.2) {
			reward += 6;
		} else if (vx >= -.2 && vx < .2) {
			reward += 10;
		} else if (vx >= .2 && vx < .4) {
			reward += 6;
		} else if (vx >= .4 && vx < .6) {
			reward += 5;
		} else if (vx >= .6 && vx < .8) {
			reward += 4;
		} else if (vx >= .8 && vx < 1) {
			reward += 3;
		} else if (vx >= 1 && vx < 2) {
			reward += 2;
		} else if (vx >= 2 && vx < 10) {
			reward += 1;
		} else if (vx >= 10) {
			reward += 0;
		}
		
		if(vy < -10) {
			reward += 0;
		} else if(vy >= -10 && vy < -2) {
			reward += 1;
		} else if (vy >= -2 && vy < -1) {
			reward += 2;
		} else if (vy >= -1 && vy < -.8) {
			reward += 3;
		} else if (vy >= -.8 && vy < -.6) {
			reward += 4;
		} else if (vy >= -.6 && vy < -.4) {
			reward += 5;
		} else if (vy >= -.4 && vy < -.2) {
			reward += 6;
		} else if (vy >= -.2 && vy < .2) {
			reward += 10;
		} else if (vy >= .2 && vy < .4) {
			reward += 6;
		} else if (vy >= .4 && vy < .6) {
			reward += 5;
		} else if (vy >= .6 && vy < .8) {
			reward += 4;
		} else if (vy >= .8 && vy < 1) {
			reward += 3;
		} else if (vy >= 1 && vy < 2) {
			reward += 2;
		} else if (vy >= 2 && vy < 10) {
			reward += 1;
		} else if (vy >= 10) {
			reward += 0;
		}

		return reward;
	}
	
	
	public static final int ANGLE_RESOLUTION = 15;
	public static final int VX_RESOLUTION = 7;
	public static final int VY_RESOLUTION = 5;
	
	public static final int VELOCITY_BOUND = 5;
	
	
	/*reward discretization function for the full hover controller */
	public static String getStateHover(double angle, double vx, double vy) {

		String state = "STATE-ANGLE-" +
						discretize(angle,ANGLE_RESOLUTION,-1.5,1.5) +
						"-VX-" + discretize(vx,VX_RESOLUTION,-VELOCITY_BOUND,VELOCITY_BOUND) +
						"-VY-" + discretize(vy,VY_RESOLUTION,-VELOCITY_BOUND-3,VELOCITY_BOUND);
		
		return state;
	}

	/* Reward function for the full hover controller */
	public static double getRewardHover(double angle, double vx, double vy) {

		double reward = 4*(((ANGLE_RESOLUTION-1)/2) - Math.abs(discretize(angle,ANGLE_RESOLUTION,-3,3) - ((ANGLE_RESOLUTION-1)/2)));
		
		reward += 4*(((VX_RESOLUTION-1)/2) - Math.abs(discretize(vx,VX_RESOLUTION,-VELOCITY_BOUND,VELOCITY_BOUND) - ((VX_RESOLUTION-1)/2)));
		
		reward += 6*(((VY_RESOLUTION-1)/2) - Math.abs(discretize(vy,VY_RESOLUTION,-VELOCITY_BOUND,VELOCITY_BOUND) - ((VY_RESOLUTION-1)/2)));

		
		
		return reward;
	}

	// ///////////////////////////////////////////////////////////
	// discretize() performs a uniform discretization of the
	// value parameter.
	// It returns an integer between 0 and nrValues-1.
	// The min and max parameters are used to specify the interval
	// for the discretization.
	// If the value is lower than min, 0 is returned
	// If the value is higher than min, nrValues-1 is returned
	// otherwise a value between 1 and nrValues-2 is returned.
	//
	// Use discretize2() if you want a discretization method that does
	// not handle values lower than min and higher than max.
	// ///////////////////////////////////////////////////////////
	public static int discretize(double value, int nrValues, double min,
			double max) {
		if (nrValues < 2) {
			return 0;
		}

		double diff = max - min;

		if (value < min) {
			return 0;
		}
		if (value > max) {
			return nrValues - 1;
		}

		double tempValue = value - min;
		double ratio = tempValue / diff;

		return (int) (ratio * (nrValues - 2)) + 1;
	}

	// ///////////////////////////////////////////////////////////
	// discretize2() performs a uniform discretization of the
	// value parameter.
	// It returns an integer between 0 and nrValues-1.
	// The min and max parameters are used to specify the interval
	// for the discretization.
	// If the value is lower than min, 0 is returned
	// If the value is higher than min, nrValues-1 is returned
	// otherwise a value between 0 and nrValues-1 is returned.
	// ///////////////////////////////////////////////////////////
	public static int discretize2(double value, int nrValues, double min,
			double max) {
		double diff = max - min;

		if (value < min) {
			return 0;
		}
		if (value > max) {
			return nrValues - 1;
		}

		double tempValue = value - min;
		double ratio = tempValue / diff;

		return (int) (ratio * nrValues);
	}

}
