/**
 */
package MrRobot.impl;

import MrRobot.Escape;
import MrRobot.MrRobotPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Escape</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class EscapeImpl extends BehaviorImpl implements Escape {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EscapeImpl() {
		super();
	}
	
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "if (left_obstacle) {\n" + 
				"			        /* turning right */\n" + 
				"			        leftSpeed  = 0.5 * MAX_SPEED;\n" + 
				"			        rightSpeed = -0.5 * MAX_SPEED;\n" + 
				"		    	}else if (right_obstacle) {\n" + 
				"		        	/* turning left */\n" + 
				"			        leftSpeed  = -0.5 * MAX_SPEED;\n" + 
				"			        rightSpeed = 0.5 * MAX_SPEED;\n" + 
				"			    }";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MrRobotPackage.Literals.ESCAPE;
	}

} //EscapeImpl
