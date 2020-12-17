/*
 * generated by Xtext 2.22.0
 */
package org.xtext.webots.mydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.webots.mydsl.myDsl.DistanceSensor;
import org.xtext.webots.mydsl.myDsl.Escape;
import org.xtext.webots.mydsl.myDsl.Home;
import org.xtext.webots.mydsl.myDsl.LeftMotor;
import org.xtext.webots.mydsl.myDsl.LightSensor;
import org.xtext.webots.mydsl.myDsl.Mission;
import org.xtext.webots.mydsl.myDsl.MyDslPackage;
import org.xtext.webots.mydsl.myDsl.RightMotor;
import org.xtext.webots.mydsl.myDsl.Robot;
import org.xtext.webots.mydsl.myDsl.RobotConfiguration;
import org.xtext.webots.mydsl.services.MyDslGrammarAccess;

@SuppressWarnings("all")
public class MyDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MyDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MyDslPackage.DISTANCE_SENSOR:
				sequence_DistanceSensor(context, (DistanceSensor) semanticObject); 
				return; 
			case MyDslPackage.ESCAPE:
				sequence_Escape(context, (Escape) semanticObject); 
				return; 
			case MyDslPackage.HOME:
				sequence_Home(context, (Home) semanticObject); 
				return; 
			case MyDslPackage.LEFT_MOTOR:
				sequence_LeftMotor(context, (LeftMotor) semanticObject); 
				return; 
			case MyDslPackage.LIGHT_SENSOR:
				sequence_LightSensor(context, (LightSensor) semanticObject); 
				return; 
			case MyDslPackage.MISSION:
				sequence_Mission(context, (Mission) semanticObject); 
				return; 
			case MyDslPackage.RIGHT_MOTOR:
				sequence_RightMotor(context, (RightMotor) semanticObject); 
				return; 
			case MyDslPackage.ROBOT:
				sequence_Robot(context, (Robot) semanticObject); 
				return; 
			case MyDslPackage.ROBOT_CONFIGURATION:
				sequence_RobotConfiguration(context, (RobotConfiguration) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Sensor returns DistanceSensor
	 *     DistanceSensor returns DistanceSensor
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_DistanceSensor(ISerializationContext context, DistanceSensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SENSOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SENSOR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDistanceSensorAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Behavior returns Escape
	 *     Escape returns Escape
	 *
	 * Constraint:
	 *     (sensors+=Sensor sensors+=Sensor*)?
	 */
	protected void sequence_Escape(ISerializationContext context, Escape semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Behavior returns Home
	 *     Home returns Home
	 *
	 * Constraint:
	 *     (sensors+=Sensor sensors+=Sensor*)?
	 */
	protected void sequence_Home(ISerializationContext context, Home semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Actuator returns LeftMotor
	 *     LeftMotor returns LeftMotor
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_LeftMotor(ISerializationContext context, LeftMotor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ACTUATOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ACTUATOR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLeftMotorAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Sensor returns LightSensor
	 *     LightSensor returns LightSensor
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_LightSensor(ISerializationContext context, LightSensor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.SENSOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.SENSOR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLightSensorAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Mission returns Mission
	 *
	 * Constraint:
	 *     (finished?='finished'? name=EString behaviors+=Behavior behaviors+=Behavior*)
	 */
	protected void sequence_Mission(ISerializationContext context, Mission semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Actuator returns RightMotor
	 *     RightMotor returns RightMotor
	 *
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_RightMotor(ISerializationContext context, RightMotor semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MyDslPackage.Literals.ACTUATOR__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MyDslPackage.Literals.ACTUATOR__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRightMotorAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     RobotConfiguration returns RobotConfiguration
	 *
	 * Constraint:
	 *     (MAX_SPEED=EDouble? TIME_STEP=EInt? robot=Robot mission=Mission?)
	 */
	protected void sequence_RobotConfiguration(ISerializationContext context, RobotConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Robot returns Robot
	 *
	 * Constraint:
	 *     (name=EString (actuators+=Actuator actuators+=Actuator*)?)
	 */
	protected void sequence_Robot(ISerializationContext context, Robot semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}