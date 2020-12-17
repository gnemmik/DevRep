/**
 */
package MrRobot.impl;

import MrRobot.Home;
import MrRobot.MrRobotPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Home</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class HomeImpl extends BehaviorImpl implements Home {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HomeImpl() {
		super();
	}
	
	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "if (left_light){\n" + 
				"			  		/* turning left */\n" + 
				"			        leftSpeed  = -0.5 * MAX_SPEED;\n" + 
				"			        rightSpeed = 0.5 * MAX_SPEED;\n" + 
				"			    }else if (right_light) {\n" + 
				"			        //turn right\n" + 
				"			        leftSpeed  = 0.5 * MAX_SPEED;\n" + 
				"			        rightSpeed = -0.5 * MAX_SPEED;\n" + 
				"			    }if (left_light && right_light) {\n" + 
				"			        leftSpeed  = 0.5 * MAX_SPEED;\n" + 
				"			        rightSpeed  = 0.5 * MAX_SPEED;\n" + 
				"			    }";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MrRobotPackage.Literals.HOME;
	}

} //HomeImpl
