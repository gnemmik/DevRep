package org.xtext.webots.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.webots.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RobotConfiguration'", "'{'", "'MAX_SPEED'", "':'", "'TIME_STEP'", "'robot'", "'mission'", "'}'", "'Robot'", "'actuators'", "','", "'finished'", "'Mission'", "'behaviors'", "'LeftMotor'", "'RightMotor'", "'Escape'", "'sensors'", "'Home'", "'DistanceSensor'", "'LightSensor'", "'-'", "'.'", "'E'", "'e'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RobotConfiguration";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRobotConfiguration"
    // InternalMyDsl.g:64:1: entryRuleRobotConfiguration returns [EObject current=null] : iv_ruleRobotConfiguration= ruleRobotConfiguration EOF ;
    public final EObject entryRuleRobotConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobotConfiguration = null;


        try {
            // InternalMyDsl.g:64:59: (iv_ruleRobotConfiguration= ruleRobotConfiguration EOF )
            // InternalMyDsl.g:65:2: iv_ruleRobotConfiguration= ruleRobotConfiguration EOF
            {
             newCompositeNode(grammarAccess.getRobotConfigurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobotConfiguration=ruleRobotConfiguration();

            state._fsp--;

             current =iv_ruleRobotConfiguration; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobotConfiguration"


    // $ANTLR start "ruleRobotConfiguration"
    // InternalMyDsl.g:71:1: ruleRobotConfiguration returns [EObject current=null] : (otherlv_0= 'RobotConfiguration' otherlv_1= '{' (otherlv_2= 'MAX_SPEED' otherlv_3= ':' ( (lv_MAX_SPEED_4_0= ruleEDouble ) ) )? (otherlv_5= 'TIME_STEP' otherlv_6= ':' ( (lv_TIME_STEP_7_0= ruleEInt ) ) )? otherlv_8= 'robot' otherlv_9= ':' ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= 'mission' otherlv_12= ':' ( (lv_mission_13_0= ruleMission ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleRobotConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_MAX_SPEED_4_0 = null;

        AntlrDatatypeRuleToken lv_TIME_STEP_7_0 = null;

        EObject lv_robot_10_0 = null;

        EObject lv_mission_13_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'RobotConfiguration' otherlv_1= '{' (otherlv_2= 'MAX_SPEED' otherlv_3= ':' ( (lv_MAX_SPEED_4_0= ruleEDouble ) ) )? (otherlv_5= 'TIME_STEP' otherlv_6= ':' ( (lv_TIME_STEP_7_0= ruleEInt ) ) )? otherlv_8= 'robot' otherlv_9= ':' ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= 'mission' otherlv_12= ':' ( (lv_mission_13_0= ruleMission ) ) )? otherlv_14= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'RobotConfiguration' otherlv_1= '{' (otherlv_2= 'MAX_SPEED' otherlv_3= ':' ( (lv_MAX_SPEED_4_0= ruleEDouble ) ) )? (otherlv_5= 'TIME_STEP' otherlv_6= ':' ( (lv_TIME_STEP_7_0= ruleEInt ) ) )? otherlv_8= 'robot' otherlv_9= ':' ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= 'mission' otherlv_12= ':' ( (lv_mission_13_0= ruleMission ) ) )? otherlv_14= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'RobotConfiguration' otherlv_1= '{' (otherlv_2= 'MAX_SPEED' otherlv_3= ':' ( (lv_MAX_SPEED_4_0= ruleEDouble ) ) )? (otherlv_5= 'TIME_STEP' otherlv_6= ':' ( (lv_TIME_STEP_7_0= ruleEInt ) ) )? otherlv_8= 'robot' otherlv_9= ':' ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= 'mission' otherlv_12= ':' ( (lv_mission_13_0= ruleMission ) ) )? otherlv_14= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'RobotConfiguration' otherlv_1= '{' (otherlv_2= 'MAX_SPEED' otherlv_3= ':' ( (lv_MAX_SPEED_4_0= ruleEDouble ) ) )? (otherlv_5= 'TIME_STEP' otherlv_6= ':' ( (lv_TIME_STEP_7_0= ruleEInt ) ) )? otherlv_8= 'robot' otherlv_9= ':' ( (lv_robot_10_0= ruleRobot ) ) (otherlv_11= 'mission' otherlv_12= ':' ( (lv_mission_13_0= ruleMission ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRobotConfigurationAccess().getRobotConfigurationKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotConfigurationAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:87:3: (otherlv_2= 'MAX_SPEED' otherlv_3= ':' ( (lv_MAX_SPEED_4_0= ruleEDouble ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:88:4: otherlv_2= 'MAX_SPEED' otherlv_3= ':' ( (lv_MAX_SPEED_4_0= ruleEDouble ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getRobotConfigurationAccess().getMAX_SPEEDKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,14,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getRobotConfigurationAccess().getColonKeyword_2_1());
                    			
                    // InternalMyDsl.g:96:4: ( (lv_MAX_SPEED_4_0= ruleEDouble ) )
                    // InternalMyDsl.g:97:5: (lv_MAX_SPEED_4_0= ruleEDouble )
                    {
                    // InternalMyDsl.g:97:5: (lv_MAX_SPEED_4_0= ruleEDouble )
                    // InternalMyDsl.g:98:6: lv_MAX_SPEED_4_0= ruleEDouble
                    {

                    						newCompositeNode(grammarAccess.getRobotConfigurationAccess().getMAX_SPEEDEDoubleParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_MAX_SPEED_4_0=ruleEDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotConfigurationRule());
                    						}
                    						set(
                    							current,
                    							"MAX_SPEED",
                    							lv_MAX_SPEED_4_0,
                    							"org.xtext.webots.mydsl.MyDsl.EDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:116:3: (otherlv_5= 'TIME_STEP' otherlv_6= ':' ( (lv_TIME_STEP_7_0= ruleEInt ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:117:4: otherlv_5= 'TIME_STEP' otherlv_6= ':' ( (lv_TIME_STEP_7_0= ruleEInt ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobotConfigurationAccess().getTIME_STEPKeyword_3_0());
                    			
                    otherlv_6=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getRobotConfigurationAccess().getColonKeyword_3_1());
                    			
                    // InternalMyDsl.g:125:4: ( (lv_TIME_STEP_7_0= ruleEInt ) )
                    // InternalMyDsl.g:126:5: (lv_TIME_STEP_7_0= ruleEInt )
                    {
                    // InternalMyDsl.g:126:5: (lv_TIME_STEP_7_0= ruleEInt )
                    // InternalMyDsl.g:127:6: lv_TIME_STEP_7_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getRobotConfigurationAccess().getTIME_STEPEIntParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_TIME_STEP_7_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotConfigurationRule());
                    						}
                    						set(
                    							current,
                    							"TIME_STEP",
                    							lv_TIME_STEP_7_0,
                    							"org.xtext.webots.mydsl.MyDsl.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_8, grammarAccess.getRobotConfigurationAccess().getRobotKeyword_4());
            		
            otherlv_9=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getRobotConfigurationAccess().getColonKeyword_5());
            		
            // InternalMyDsl.g:153:3: ( (lv_robot_10_0= ruleRobot ) )
            // InternalMyDsl.g:154:4: (lv_robot_10_0= ruleRobot )
            {
            // InternalMyDsl.g:154:4: (lv_robot_10_0= ruleRobot )
            // InternalMyDsl.g:155:5: lv_robot_10_0= ruleRobot
            {

            					newCompositeNode(grammarAccess.getRobotConfigurationAccess().getRobotRobotParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_11);
            lv_robot_10_0=ruleRobot();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotConfigurationRule());
            					}
            					set(
            						current,
            						"robot",
            						lv_robot_10_0,
            						"org.xtext.webots.mydsl.MyDsl.Robot");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:172:3: (otherlv_11= 'mission' otherlv_12= ':' ( (lv_mission_13_0= ruleMission ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:173:4: otherlv_11= 'mission' otherlv_12= ':' ( (lv_mission_13_0= ruleMission ) )
                    {
                    otherlv_11=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getRobotConfigurationAccess().getMissionKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,14,FOLLOW_12); 

                    				newLeafNode(otherlv_12, grammarAccess.getRobotConfigurationAccess().getColonKeyword_7_1());
                    			
                    // InternalMyDsl.g:181:4: ( (lv_mission_13_0= ruleMission ) )
                    // InternalMyDsl.g:182:5: (lv_mission_13_0= ruleMission )
                    {
                    // InternalMyDsl.g:182:5: (lv_mission_13_0= ruleMission )
                    // InternalMyDsl.g:183:6: lv_mission_13_0= ruleMission
                    {

                    						newCompositeNode(grammarAccess.getRobotConfigurationAccess().getMissionMissionParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_mission_13_0=ruleMission();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotConfigurationRule());
                    						}
                    						set(
                    							current,
                    							"mission",
                    							lv_mission_13_0,
                    							"org.xtext.webots.mydsl.MyDsl.Mission");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getRobotConfigurationAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobotConfiguration"


    // $ANTLR start "entryRuleActuator"
    // InternalMyDsl.g:209:1: entryRuleActuator returns [EObject current=null] : iv_ruleActuator= ruleActuator EOF ;
    public final EObject entryRuleActuator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActuator = null;


        try {
            // InternalMyDsl.g:209:49: (iv_ruleActuator= ruleActuator EOF )
            // InternalMyDsl.g:210:2: iv_ruleActuator= ruleActuator EOF
            {
             newCompositeNode(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActuator=ruleActuator();

            state._fsp--;

             current =iv_ruleActuator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalMyDsl.g:216:1: ruleActuator returns [EObject current=null] : (this_LeftMotor_0= ruleLeftMotor | this_RightMotor_1= ruleRightMotor ) ;
    public final EObject ruleActuator() throws RecognitionException {
        EObject current = null;

        EObject this_LeftMotor_0 = null;

        EObject this_RightMotor_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:222:2: ( (this_LeftMotor_0= ruleLeftMotor | this_RightMotor_1= ruleRightMotor ) )
            // InternalMyDsl.g:223:2: (this_LeftMotor_0= ruleLeftMotor | this_RightMotor_1= ruleRightMotor )
            {
            // InternalMyDsl.g:223:2: (this_LeftMotor_0= ruleLeftMotor | this_RightMotor_1= ruleRightMotor )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==25) ) {
                alt4=1;
            }
            else if ( (LA4_0==26) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:224:3: this_LeftMotor_0= ruleLeftMotor
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getLeftMotorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LeftMotor_0=ruleLeftMotor();

                    state._fsp--;


                    			current = this_LeftMotor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:233:3: this_RightMotor_1= ruleRightMotor
                    {

                    			newCompositeNode(grammarAccess.getActuatorAccess().getRightMotorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RightMotor_1=ruleRightMotor();

                    state._fsp--;


                    			current = this_RightMotor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleBehavior"
    // InternalMyDsl.g:245:1: entryRuleBehavior returns [EObject current=null] : iv_ruleBehavior= ruleBehavior EOF ;
    public final EObject entryRuleBehavior() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBehavior = null;


        try {
            // InternalMyDsl.g:245:49: (iv_ruleBehavior= ruleBehavior EOF )
            // InternalMyDsl.g:246:2: iv_ruleBehavior= ruleBehavior EOF
            {
             newCompositeNode(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBehavior=ruleBehavior();

            state._fsp--;

             current =iv_ruleBehavior; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // InternalMyDsl.g:252:1: ruleBehavior returns [EObject current=null] : (this_Escape_0= ruleEscape | this_Home_1= ruleHome ) ;
    public final EObject ruleBehavior() throws RecognitionException {
        EObject current = null;

        EObject this_Escape_0 = null;

        EObject this_Home_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:258:2: ( (this_Escape_0= ruleEscape | this_Home_1= ruleHome ) )
            // InternalMyDsl.g:259:2: (this_Escape_0= ruleEscape | this_Home_1= ruleHome )
            {
            // InternalMyDsl.g:259:2: (this_Escape_0= ruleEscape | this_Home_1= ruleHome )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            else if ( (LA5_0==29) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:260:3: this_Escape_0= ruleEscape
                    {

                    			newCompositeNode(grammarAccess.getBehaviorAccess().getEscapeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Escape_0=ruleEscape();

                    state._fsp--;


                    			current = this_Escape_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:269:3: this_Home_1= ruleHome
                    {

                    			newCompositeNode(grammarAccess.getBehaviorAccess().getHomeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Home_1=ruleHome();

                    state._fsp--;


                    			current = this_Home_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleSensor"
    // InternalMyDsl.g:281:1: entryRuleSensor returns [EObject current=null] : iv_ruleSensor= ruleSensor EOF ;
    public final EObject entryRuleSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSensor = null;


        try {
            // InternalMyDsl.g:281:47: (iv_ruleSensor= ruleSensor EOF )
            // InternalMyDsl.g:282:2: iv_ruleSensor= ruleSensor EOF
            {
             newCompositeNode(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSensor=ruleSensor();

            state._fsp--;

             current =iv_ruleSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalMyDsl.g:288:1: ruleSensor returns [EObject current=null] : (this_DistanceSensor_0= ruleDistanceSensor | this_LightSensor_1= ruleLightSensor ) ;
    public final EObject ruleSensor() throws RecognitionException {
        EObject current = null;

        EObject this_DistanceSensor_0 = null;

        EObject this_LightSensor_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:294:2: ( (this_DistanceSensor_0= ruleDistanceSensor | this_LightSensor_1= ruleLightSensor ) )
            // InternalMyDsl.g:295:2: (this_DistanceSensor_0= ruleDistanceSensor | this_LightSensor_1= ruleLightSensor )
            {
            // InternalMyDsl.g:295:2: (this_DistanceSensor_0= ruleDistanceSensor | this_LightSensor_1= ruleLightSensor )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            else if ( (LA6_0==31) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:296:3: this_DistanceSensor_0= ruleDistanceSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getDistanceSensorParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DistanceSensor_0=ruleDistanceSensor();

                    state._fsp--;


                    			current = this_DistanceSensor_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:305:3: this_LightSensor_1= ruleLightSensor
                    {

                    			newCompositeNode(grammarAccess.getSensorAccess().getLightSensorParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LightSensor_1=ruleLightSensor();

                    state._fsp--;


                    			current = this_LightSensor_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleRobot"
    // InternalMyDsl.g:317:1: entryRuleRobot returns [EObject current=null] : iv_ruleRobot= ruleRobot EOF ;
    public final EObject entryRuleRobot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRobot = null;


        try {
            // InternalMyDsl.g:317:46: (iv_ruleRobot= ruleRobot EOF )
            // InternalMyDsl.g:318:2: iv_ruleRobot= ruleRobot EOF
            {
             newCompositeNode(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRobot=ruleRobot();

            state._fsp--;

             current =iv_ruleRobot; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalMyDsl.g:324:1: ruleRobot returns [EObject current=null] : ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actuators' otherlv_5= ':' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleRobot() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_actuators_6_0 = null;

        EObject lv_actuators_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:330:2: ( ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actuators' otherlv_5= ':' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* )? otherlv_9= '}' ) )
            // InternalMyDsl.g:331:2: ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actuators' otherlv_5= ':' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* )? otherlv_9= '}' )
            {
            // InternalMyDsl.g:331:2: ( () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actuators' otherlv_5= ':' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* )? otherlv_9= '}' )
            // InternalMyDsl.g:332:3: () otherlv_1= 'Robot' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actuators' otherlv_5= ':' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* )? otherlv_9= '}'
            {
            // InternalMyDsl.g:332:3: ()
            // InternalMyDsl.g:333:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRobotAccess().getRobotAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getRobotAccess().getRobotKeyword_1());
            		
            // InternalMyDsl.g:343:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:344:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:344:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:345:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRobotRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.webots.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:366:3: (otherlv_4= 'actuators' otherlv_5= ':' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:367:4: otherlv_4= 'actuators' otherlv_5= ':' ( (lv_actuators_6_0= ruleActuator ) ) (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )*
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRobotAccess().getActuatorsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,14,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getRobotAccess().getColonKeyword_4_1());
                    			
                    // InternalMyDsl.g:375:4: ( (lv_actuators_6_0= ruleActuator ) )
                    // InternalMyDsl.g:376:5: (lv_actuators_6_0= ruleActuator )
                    {
                    // InternalMyDsl.g:376:5: (lv_actuators_6_0= ruleActuator )
                    // InternalMyDsl.g:377:6: lv_actuators_6_0= ruleActuator
                    {

                    						newCompositeNode(grammarAccess.getRobotAccess().getActuatorsActuatorParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_actuators_6_0=ruleActuator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRobotRule());
                    						}
                    						add(
                    							current,
                    							"actuators",
                    							lv_actuators_6_0,
                    							"org.xtext.webots.mydsl.MyDsl.Actuator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:394:4: (otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalMyDsl.g:395:5: otherlv_7= ',' ( (lv_actuators_8_0= ruleActuator ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_16); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getRobotAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:399:5: ( (lv_actuators_8_0= ruleActuator ) )
                    	    // InternalMyDsl.g:400:6: (lv_actuators_8_0= ruleActuator )
                    	    {
                    	    // InternalMyDsl.g:400:6: (lv_actuators_8_0= ruleActuator )
                    	    // InternalMyDsl.g:401:7: lv_actuators_8_0= ruleActuator
                    	    {

                    	    							newCompositeNode(grammarAccess.getRobotAccess().getActuatorsActuatorParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_actuators_8_0=ruleActuator();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRobotRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actuators",
                    	    								lv_actuators_8_0,
                    	    								"org.xtext.webots.mydsl.MyDsl.Actuator");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleMission"
    // InternalMyDsl.g:428:1: entryRuleMission returns [EObject current=null] : iv_ruleMission= ruleMission EOF ;
    public final EObject entryRuleMission() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMission = null;


        try {
            // InternalMyDsl.g:428:48: (iv_ruleMission= ruleMission EOF )
            // InternalMyDsl.g:429:2: iv_ruleMission= ruleMission EOF
            {
             newCompositeNode(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMission=ruleMission();

            state._fsp--;

             current =iv_ruleMission; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalMyDsl.g:435:1: ruleMission returns [EObject current=null] : ( ( (lv_finished_0_0= 'finished' ) )? otherlv_1= 'Mission' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'behaviors' otherlv_5= ':' ( (lv_behaviors_6_0= ruleBehavior ) ) (otherlv_7= ',' ( (lv_behaviors_8_0= ruleBehavior ) ) )* otherlv_9= '}' ) ;
    public final EObject ruleMission() throws RecognitionException {
        EObject current = null;

        Token lv_finished_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_behaviors_6_0 = null;

        EObject lv_behaviors_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:441:2: ( ( ( (lv_finished_0_0= 'finished' ) )? otherlv_1= 'Mission' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'behaviors' otherlv_5= ':' ( (lv_behaviors_6_0= ruleBehavior ) ) (otherlv_7= ',' ( (lv_behaviors_8_0= ruleBehavior ) ) )* otherlv_9= '}' ) )
            // InternalMyDsl.g:442:2: ( ( (lv_finished_0_0= 'finished' ) )? otherlv_1= 'Mission' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'behaviors' otherlv_5= ':' ( (lv_behaviors_6_0= ruleBehavior ) ) (otherlv_7= ',' ( (lv_behaviors_8_0= ruleBehavior ) ) )* otherlv_9= '}' )
            {
            // InternalMyDsl.g:442:2: ( ( (lv_finished_0_0= 'finished' ) )? otherlv_1= 'Mission' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'behaviors' otherlv_5= ':' ( (lv_behaviors_6_0= ruleBehavior ) ) (otherlv_7= ',' ( (lv_behaviors_8_0= ruleBehavior ) ) )* otherlv_9= '}' )
            // InternalMyDsl.g:443:3: ( (lv_finished_0_0= 'finished' ) )? otherlv_1= 'Mission' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' otherlv_4= 'behaviors' otherlv_5= ':' ( (lv_behaviors_6_0= ruleBehavior ) ) (otherlv_7= ',' ( (lv_behaviors_8_0= ruleBehavior ) ) )* otherlv_9= '}'
            {
            // InternalMyDsl.g:443:3: ( (lv_finished_0_0= 'finished' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:444:4: (lv_finished_0_0= 'finished' )
                    {
                    // InternalMyDsl.g:444:4: (lv_finished_0_0= 'finished' )
                    // InternalMyDsl.g:445:5: lv_finished_0_0= 'finished'
                    {
                    lv_finished_0_0=(Token)match(input,22,FOLLOW_18); 

                    					newLeafNode(lv_finished_0_0, grammarAccess.getMissionAccess().getFinishedFinishedKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMissionRule());
                    					}
                    					setWithLastConsumed(current, "finished", lv_finished_0_0 != null, "finished");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,23,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionAccess().getMissionKeyword_1());
            		
            // InternalMyDsl.g:461:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:462:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:462:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:463:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.webots.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_3());
            		
            otherlv_4=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_4, grammarAccess.getMissionAccess().getBehaviorsKeyword_4());
            		
            otherlv_5=(Token)match(input,14,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getMissionAccess().getColonKeyword_5());
            		
            // InternalMyDsl.g:492:3: ( (lv_behaviors_6_0= ruleBehavior ) )
            // InternalMyDsl.g:493:4: (lv_behaviors_6_0= ruleBehavior )
            {
            // InternalMyDsl.g:493:4: (lv_behaviors_6_0= ruleBehavior )
            // InternalMyDsl.g:494:5: lv_behaviors_6_0= ruleBehavior
            {

            					newCompositeNode(grammarAccess.getMissionAccess().getBehaviorsBehaviorParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_17);
            lv_behaviors_6_0=ruleBehavior();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMissionRule());
            					}
            					add(
            						current,
            						"behaviors",
            						lv_behaviors_6_0,
            						"org.xtext.webots.mydsl.MyDsl.Behavior");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:511:3: (otherlv_7= ',' ( (lv_behaviors_8_0= ruleBehavior ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==21) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:512:4: otherlv_7= ',' ( (lv_behaviors_8_0= ruleBehavior ) )
            	    {
            	    otherlv_7=(Token)match(input,21,FOLLOW_20); 

            	    				newLeafNode(otherlv_7, grammarAccess.getMissionAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalMyDsl.g:516:4: ( (lv_behaviors_8_0= ruleBehavior ) )
            	    // InternalMyDsl.g:517:5: (lv_behaviors_8_0= ruleBehavior )
            	    {
            	    // InternalMyDsl.g:517:5: (lv_behaviors_8_0= ruleBehavior )
            	    // InternalMyDsl.g:518:6: lv_behaviors_8_0= ruleBehavior
            	    {

            	    						newCompositeNode(grammarAccess.getMissionAccess().getBehaviorsBehaviorParserRuleCall_7_1_0());
            	    					
            	    pushFollow(FOLLOW_17);
            	    lv_behaviors_8_0=ruleBehavior();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMissionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"behaviors",
            	    							lv_behaviors_8_0,
            	    							"org.xtext.webots.mydsl.MyDsl.Behavior");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleLeftMotor"
    // InternalMyDsl.g:544:1: entryRuleLeftMotor returns [EObject current=null] : iv_ruleLeftMotor= ruleLeftMotor EOF ;
    public final EObject entryRuleLeftMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftMotor = null;


        try {
            // InternalMyDsl.g:544:50: (iv_ruleLeftMotor= ruleLeftMotor EOF )
            // InternalMyDsl.g:545:2: iv_ruleLeftMotor= ruleLeftMotor EOF
            {
             newCompositeNode(grammarAccess.getLeftMotorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftMotor=ruleLeftMotor();

            state._fsp--;

             current =iv_ruleLeftMotor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftMotor"


    // $ANTLR start "ruleLeftMotor"
    // InternalMyDsl.g:551:1: ruleLeftMotor returns [EObject current=null] : ( () otherlv_1= 'LeftMotor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleLeftMotor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:557:2: ( ( () otherlv_1= 'LeftMotor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:558:2: ( () otherlv_1= 'LeftMotor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:558:2: ( () otherlv_1= 'LeftMotor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:559:3: () otherlv_1= 'LeftMotor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:559:3: ()
            // InternalMyDsl.g:560:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLeftMotorAccess().getLeftMotorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftMotorAccess().getLeftMotorKeyword_1());
            		
            // InternalMyDsl.g:570:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:571:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:571:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:572:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLeftMotorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLeftMotorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.webots.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeftMotor"


    // $ANTLR start "entryRuleRightMotor"
    // InternalMyDsl.g:593:1: entryRuleRightMotor returns [EObject current=null] : iv_ruleRightMotor= ruleRightMotor EOF ;
    public final EObject entryRuleRightMotor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRightMotor = null;


        try {
            // InternalMyDsl.g:593:51: (iv_ruleRightMotor= ruleRightMotor EOF )
            // InternalMyDsl.g:594:2: iv_ruleRightMotor= ruleRightMotor EOF
            {
             newCompositeNode(grammarAccess.getRightMotorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRightMotor=ruleRightMotor();

            state._fsp--;

             current =iv_ruleRightMotor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRightMotor"


    // $ANTLR start "ruleRightMotor"
    // InternalMyDsl.g:600:1: ruleRightMotor returns [EObject current=null] : ( () otherlv_1= 'RightMotor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleRightMotor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:606:2: ( ( () otherlv_1= 'RightMotor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:607:2: ( () otherlv_1= 'RightMotor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:607:2: ( () otherlv_1= 'RightMotor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:608:3: () otherlv_1= 'RightMotor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:608:3: ()
            // InternalMyDsl.g:609:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRightMotorAccess().getRightMotorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getRightMotorAccess().getRightMotorKeyword_1());
            		
            // InternalMyDsl.g:619:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:620:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:620:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:621:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRightMotorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRightMotorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.webots.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRightMotor"


    // $ANTLR start "entryRuleEscape"
    // InternalMyDsl.g:642:1: entryRuleEscape returns [EObject current=null] : iv_ruleEscape= ruleEscape EOF ;
    public final EObject entryRuleEscape() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscape = null;


        try {
            // InternalMyDsl.g:642:47: (iv_ruleEscape= ruleEscape EOF )
            // InternalMyDsl.g:643:2: iv_ruleEscape= ruleEscape EOF
            {
             newCompositeNode(grammarAccess.getEscapeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEscape=ruleEscape();

            state._fsp--;

             current =iv_ruleEscape; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEscape"


    // $ANTLR start "ruleEscape"
    // InternalMyDsl.g:649:1: ruleEscape returns [EObject current=null] : ( () otherlv_1= 'Escape' otherlv_2= '{' (otherlv_3= 'sensors' otherlv_4= ':' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleEscape() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_sensors_5_0 = null;

        EObject lv_sensors_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:655:2: ( ( () otherlv_1= 'Escape' otherlv_2= '{' (otherlv_3= 'sensors' otherlv_4= ':' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* )? otherlv_8= '}' ) )
            // InternalMyDsl.g:656:2: ( () otherlv_1= 'Escape' otherlv_2= '{' (otherlv_3= 'sensors' otherlv_4= ':' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:656:2: ( () otherlv_1= 'Escape' otherlv_2= '{' (otherlv_3= 'sensors' otherlv_4= ':' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* )? otherlv_8= '}' )
            // InternalMyDsl.g:657:3: () otherlv_1= 'Escape' otherlv_2= '{' (otherlv_3= 'sensors' otherlv_4= ':' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* )? otherlv_8= '}'
            {
            // InternalMyDsl.g:657:3: ()
            // InternalMyDsl.g:658:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEscapeAccess().getEscapeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEscapeAccess().getEscapeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getEscapeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:672:3: (otherlv_3= 'sensors' otherlv_4= ':' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:673:4: otherlv_3= 'sensors' otherlv_4= ':' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )*
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getEscapeAccess().getSensorsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getEscapeAccess().getColonKeyword_3_1());
                    			
                    // InternalMyDsl.g:681:4: ( (lv_sensors_5_0= ruleSensor ) )
                    // InternalMyDsl.g:682:5: (lv_sensors_5_0= ruleSensor )
                    {
                    // InternalMyDsl.g:682:5: (lv_sensors_5_0= ruleSensor )
                    // InternalMyDsl.g:683:6: lv_sensors_5_0= ruleSensor
                    {

                    						newCompositeNode(grammarAccess.getEscapeAccess().getSensorsSensorParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_sensors_5_0=ruleSensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEscapeRule());
                    						}
                    						add(
                    							current,
                    							"sensors",
                    							lv_sensors_5_0,
                    							"org.xtext.webots.mydsl.MyDsl.Sensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:700:4: (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==21) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:701:5: otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_22); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getEscapeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:705:5: ( (lv_sensors_7_0= ruleSensor ) )
                    	    // InternalMyDsl.g:706:6: (lv_sensors_7_0= ruleSensor )
                    	    {
                    	    // InternalMyDsl.g:706:6: (lv_sensors_7_0= ruleSensor )
                    	    // InternalMyDsl.g:707:7: lv_sensors_7_0= ruleSensor
                    	    {

                    	    							newCompositeNode(grammarAccess.getEscapeAccess().getSensorsSensorParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_sensors_7_0=ruleSensor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEscapeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sensors",
                    	    								lv_sensors_7_0,
                    	    								"org.xtext.webots.mydsl.MyDsl.Sensor");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getEscapeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEscape"


    // $ANTLR start "entryRuleHome"
    // InternalMyDsl.g:734:1: entryRuleHome returns [EObject current=null] : iv_ruleHome= ruleHome EOF ;
    public final EObject entryRuleHome() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHome = null;


        try {
            // InternalMyDsl.g:734:45: (iv_ruleHome= ruleHome EOF )
            // InternalMyDsl.g:735:2: iv_ruleHome= ruleHome EOF
            {
             newCompositeNode(grammarAccess.getHomeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHome=ruleHome();

            state._fsp--;

             current =iv_ruleHome; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHome"


    // $ANTLR start "ruleHome"
    // InternalMyDsl.g:741:1: ruleHome returns [EObject current=null] : ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'sensors' otherlv_4= ':' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* )? otherlv_8= '}' ) ;
    public final EObject ruleHome() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_sensors_5_0 = null;

        EObject lv_sensors_7_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:747:2: ( ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'sensors' otherlv_4= ':' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* )? otherlv_8= '}' ) )
            // InternalMyDsl.g:748:2: ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'sensors' otherlv_4= ':' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* )? otherlv_8= '}' )
            {
            // InternalMyDsl.g:748:2: ( () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'sensors' otherlv_4= ':' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* )? otherlv_8= '}' )
            // InternalMyDsl.g:749:3: () otherlv_1= 'Home' otherlv_2= '{' (otherlv_3= 'sensors' otherlv_4= ':' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* )? otherlv_8= '}'
            {
            // InternalMyDsl.g:749:3: ()
            // InternalMyDsl.g:750:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHomeAccess().getHomeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getHomeAccess().getHomeKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:764:3: (otherlv_3= 'sensors' otherlv_4= ':' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==28) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:765:4: otherlv_3= 'sensors' otherlv_4= ':' ( (lv_sensors_5_0= ruleSensor ) ) (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )*
                    {
                    otherlv_3=(Token)match(input,28,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getHomeAccess().getSensorsKeyword_3_0());
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_22); 

                    				newLeafNode(otherlv_4, grammarAccess.getHomeAccess().getColonKeyword_3_1());
                    			
                    // InternalMyDsl.g:773:4: ( (lv_sensors_5_0= ruleSensor ) )
                    // InternalMyDsl.g:774:5: (lv_sensors_5_0= ruleSensor )
                    {
                    // InternalMyDsl.g:774:5: (lv_sensors_5_0= ruleSensor )
                    // InternalMyDsl.g:775:6: lv_sensors_5_0= ruleSensor
                    {

                    						newCompositeNode(grammarAccess.getHomeAccess().getSensorsSensorParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_sensors_5_0=ruleSensor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getHomeRule());
                    						}
                    						add(
                    							current,
                    							"sensors",
                    							lv_sensors_5_0,
                    							"org.xtext.webots.mydsl.MyDsl.Sensor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:792:4: (otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==21) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMyDsl.g:793:5: otherlv_6= ',' ( (lv_sensors_7_0= ruleSensor ) )
                    	    {
                    	    otherlv_6=(Token)match(input,21,FOLLOW_22); 

                    	    					newLeafNode(otherlv_6, grammarAccess.getHomeAccess().getCommaKeyword_3_3_0());
                    	    				
                    	    // InternalMyDsl.g:797:5: ( (lv_sensors_7_0= ruleSensor ) )
                    	    // InternalMyDsl.g:798:6: (lv_sensors_7_0= ruleSensor )
                    	    {
                    	    // InternalMyDsl.g:798:6: (lv_sensors_7_0= ruleSensor )
                    	    // InternalMyDsl.g:799:7: lv_sensors_7_0= ruleSensor
                    	    {

                    	    							newCompositeNode(grammarAccess.getHomeAccess().getSensorsSensorParserRuleCall_3_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    lv_sensors_7_0=ruleSensor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getHomeRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"sensors",
                    	    								lv_sensors_7_0,
                    	    								"org.xtext.webots.mydsl.MyDsl.Sensor");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHome"


    // $ANTLR start "entryRuleDistanceSensor"
    // InternalMyDsl.g:826:1: entryRuleDistanceSensor returns [EObject current=null] : iv_ruleDistanceSensor= ruleDistanceSensor EOF ;
    public final EObject entryRuleDistanceSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDistanceSensor = null;


        try {
            // InternalMyDsl.g:826:55: (iv_ruleDistanceSensor= ruleDistanceSensor EOF )
            // InternalMyDsl.g:827:2: iv_ruleDistanceSensor= ruleDistanceSensor EOF
            {
             newCompositeNode(grammarAccess.getDistanceSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDistanceSensor=ruleDistanceSensor();

            state._fsp--;

             current =iv_ruleDistanceSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDistanceSensor"


    // $ANTLR start "ruleDistanceSensor"
    // InternalMyDsl.g:833:1: ruleDistanceSensor returns [EObject current=null] : ( () otherlv_1= 'DistanceSensor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleDistanceSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:839:2: ( ( () otherlv_1= 'DistanceSensor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:840:2: ( () otherlv_1= 'DistanceSensor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:840:2: ( () otherlv_1= 'DistanceSensor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:841:3: () otherlv_1= 'DistanceSensor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:841:3: ()
            // InternalMyDsl.g:842:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDistanceSensorAccess().getDistanceSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getDistanceSensorAccess().getDistanceSensorKeyword_1());
            		
            // InternalMyDsl.g:852:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:853:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:853:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:854:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDistanceSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDistanceSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.webots.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDistanceSensor"


    // $ANTLR start "entryRuleLightSensor"
    // InternalMyDsl.g:875:1: entryRuleLightSensor returns [EObject current=null] : iv_ruleLightSensor= ruleLightSensor EOF ;
    public final EObject entryRuleLightSensor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLightSensor = null;


        try {
            // InternalMyDsl.g:875:52: (iv_ruleLightSensor= ruleLightSensor EOF )
            // InternalMyDsl.g:876:2: iv_ruleLightSensor= ruleLightSensor EOF
            {
             newCompositeNode(grammarAccess.getLightSensorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLightSensor=ruleLightSensor();

            state._fsp--;

             current =iv_ruleLightSensor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLightSensor"


    // $ANTLR start "ruleLightSensor"
    // InternalMyDsl.g:882:1: ruleLightSensor returns [EObject current=null] : ( () otherlv_1= 'LightSensor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleLightSensor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:888:2: ( ( () otherlv_1= 'LightSensor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:889:2: ( () otherlv_1= 'LightSensor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:889:2: ( () otherlv_1= 'LightSensor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:890:3: () otherlv_1= 'LightSensor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:890:3: ()
            // InternalMyDsl.g:891:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLightSensorAccess().getLightSensorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getLightSensorAccess().getLightSensorKeyword_1());
            		
            // InternalMyDsl.g:901:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:902:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:902:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:903:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getLightSensorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLightSensorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.webots.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLightSensor"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyDsl.g:924:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalMyDsl.g:924:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalMyDsl.g:925:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalMyDsl.g:931:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalMyDsl.g:937:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalMyDsl.g:938:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalMyDsl.g:938:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalMyDsl.g:939:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalMyDsl.g:939:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:940:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_23); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:946:3: (this_INT_1= RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:947:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_24); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,33,FOLLOW_25); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_26); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalMyDsl.g:967:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=34 && LA19_0<=35)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:968:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalMyDsl.g:968:4: (kw= 'E' | kw= 'e' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==34) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==35) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMyDsl.g:969:5: kw= 'E'
                            {
                            kw=(Token)match(input,34,FOLLOW_8); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:975:5: kw= 'e'
                            {
                            kw=(Token)match(input,35,FOLLOW_8); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMyDsl.g:981:4: (kw= '-' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==32) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMyDsl.g:982:5: kw= '-'
                            {
                            kw=(Token)match(input,32,FOLLOW_25); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:1000:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalMyDsl.g:1000:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalMyDsl.g:1001:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:1007:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1013:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalMyDsl.g:1014:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalMyDsl.g:1014:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalMyDsl.g:1015:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalMyDsl.g:1015:3: (kw= '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:1016:4: kw= '-'
                    {
                    kw=(Token)match(input,32,FOLLOW_25); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:1033:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:1033:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:1034:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:1040:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1046:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:1047:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:1047:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:1048:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1056:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000001A000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000300000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000200000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000C00000002L});

}