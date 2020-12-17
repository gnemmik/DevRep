package org.xtext.webots.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.webots.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'RobotConfiguration'", "'{'", "'robot'", "':'", "'}'", "'MAX_SPEED'", "'TIME_STEP'", "'mission'", "'Robot'", "'actuators'", "','", "'Mission'", "'behaviors'", "'LeftMotor'", "'RightMotor'", "'Escape'", "'sensors'", "'Home'", "'DistanceSensor'", "'LightSensor'", "'-'", "'.'", "'finished'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleRobotConfiguration"
    // InternalMyDsl.g:53:1: entryRuleRobotConfiguration : ruleRobotConfiguration EOF ;
    public final void entryRuleRobotConfiguration() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleRobotConfiguration EOF )
            // InternalMyDsl.g:55:1: ruleRobotConfiguration EOF
            {
             before(grammarAccess.getRobotConfigurationRule()); 
            pushFollow(FOLLOW_1);
            ruleRobotConfiguration();

            state._fsp--;

             after(grammarAccess.getRobotConfigurationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRobotConfiguration"


    // $ANTLR start "ruleRobotConfiguration"
    // InternalMyDsl.g:62:1: ruleRobotConfiguration : ( ( rule__RobotConfiguration__Group__0 ) ) ;
    public final void ruleRobotConfiguration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__RobotConfiguration__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__RobotConfiguration__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__RobotConfiguration__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__RobotConfiguration__Group__0 )
            {
             before(grammarAccess.getRobotConfigurationAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__RobotConfiguration__Group__0 )
            // InternalMyDsl.g:69:4: rule__RobotConfiguration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotConfigurationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobotConfiguration"


    // $ANTLR start "entryRuleActuator"
    // InternalMyDsl.g:78:1: entryRuleActuator : ruleActuator EOF ;
    public final void entryRuleActuator() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleActuator EOF )
            // InternalMyDsl.g:80:1: ruleActuator EOF
            {
             before(grammarAccess.getActuatorRule()); 
            pushFollow(FOLLOW_1);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getActuatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActuator"


    // $ANTLR start "ruleActuator"
    // InternalMyDsl.g:87:1: ruleActuator : ( ( rule__Actuator__Alternatives ) ) ;
    public final void ruleActuator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Actuator__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Actuator__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Actuator__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Actuator__Alternatives )
            {
             before(grammarAccess.getActuatorAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Actuator__Alternatives )
            // InternalMyDsl.g:94:4: rule__Actuator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Actuator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActuatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActuator"


    // $ANTLR start "entryRuleBehavior"
    // InternalMyDsl.g:103:1: entryRuleBehavior : ruleBehavior EOF ;
    public final void entryRuleBehavior() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleBehavior EOF )
            // InternalMyDsl.g:105:1: ruleBehavior EOF
            {
             before(grammarAccess.getBehaviorRule()); 
            pushFollow(FOLLOW_1);
            ruleBehavior();

            state._fsp--;

             after(grammarAccess.getBehaviorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBehavior"


    // $ANTLR start "ruleBehavior"
    // InternalMyDsl.g:112:1: ruleBehavior : ( ( rule__Behavior__Alternatives ) ) ;
    public final void ruleBehavior() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Behavior__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Behavior__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Behavior__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Behavior__Alternatives )
            {
             before(grammarAccess.getBehaviorAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Behavior__Alternatives )
            // InternalMyDsl.g:119:4: rule__Behavior__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Behavior__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBehaviorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBehavior"


    // $ANTLR start "entryRuleSensor"
    // InternalMyDsl.g:128:1: entryRuleSensor : ruleSensor EOF ;
    public final void entryRuleSensor() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleSensor EOF )
            // InternalMyDsl.g:130:1: ruleSensor EOF
            {
             before(grammarAccess.getSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSensor"


    // $ANTLR start "ruleSensor"
    // InternalMyDsl.g:137:1: ruleSensor : ( ( rule__Sensor__Alternatives ) ) ;
    public final void ruleSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Sensor__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Sensor__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Sensor__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Sensor__Alternatives )
            {
             before(grammarAccess.getSensorAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Sensor__Alternatives )
            // InternalMyDsl.g:144:4: rule__Sensor__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Sensor__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSensorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSensor"


    // $ANTLR start "entryRuleRobot"
    // InternalMyDsl.g:153:1: entryRuleRobot : ruleRobot EOF ;
    public final void entryRuleRobot() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleRobot EOF )
            // InternalMyDsl.g:155:1: ruleRobot EOF
            {
             before(grammarAccess.getRobotRule()); 
            pushFollow(FOLLOW_1);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRobot"


    // $ANTLR start "ruleRobot"
    // InternalMyDsl.g:162:1: ruleRobot : ( ( rule__Robot__Group__0 ) ) ;
    public final void ruleRobot() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Robot__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Robot__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Robot__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Robot__Group__0 )
            {
             before(grammarAccess.getRobotAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Robot__Group__0 )
            // InternalMyDsl.g:169:4: rule__Robot__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRobot"


    // $ANTLR start "entryRuleMission"
    // InternalMyDsl.g:178:1: entryRuleMission : ruleMission EOF ;
    public final void entryRuleMission() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleMission EOF )
            // InternalMyDsl.g:180:1: ruleMission EOF
            {
             before(grammarAccess.getMissionRule()); 
            pushFollow(FOLLOW_1);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getMissionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMission"


    // $ANTLR start "ruleMission"
    // InternalMyDsl.g:187:1: ruleMission : ( ( rule__Mission__Group__0 ) ) ;
    public final void ruleMission() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Mission__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Mission__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Mission__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Mission__Group__0 )
            {
             before(grammarAccess.getMissionAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Mission__Group__0 )
            // InternalMyDsl.g:194:4: rule__Mission__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMission"


    // $ANTLR start "entryRuleLeftMotor"
    // InternalMyDsl.g:203:1: entryRuleLeftMotor : ruleLeftMotor EOF ;
    public final void entryRuleLeftMotor() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleLeftMotor EOF )
            // InternalMyDsl.g:205:1: ruleLeftMotor EOF
            {
             before(grammarAccess.getLeftMotorRule()); 
            pushFollow(FOLLOW_1);
            ruleLeftMotor();

            state._fsp--;

             after(grammarAccess.getLeftMotorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLeftMotor"


    // $ANTLR start "ruleLeftMotor"
    // InternalMyDsl.g:212:1: ruleLeftMotor : ( ( rule__LeftMotor__Group__0 ) ) ;
    public final void ruleLeftMotor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__LeftMotor__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__LeftMotor__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__LeftMotor__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__LeftMotor__Group__0 )
            {
             before(grammarAccess.getLeftMotorAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__LeftMotor__Group__0 )
            // InternalMyDsl.g:219:4: rule__LeftMotor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeftMotor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftMotorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLeftMotor"


    // $ANTLR start "entryRuleRightMotor"
    // InternalMyDsl.g:228:1: entryRuleRightMotor : ruleRightMotor EOF ;
    public final void entryRuleRightMotor() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleRightMotor EOF )
            // InternalMyDsl.g:230:1: ruleRightMotor EOF
            {
             before(grammarAccess.getRightMotorRule()); 
            pushFollow(FOLLOW_1);
            ruleRightMotor();

            state._fsp--;

             after(grammarAccess.getRightMotorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRightMotor"


    // $ANTLR start "ruleRightMotor"
    // InternalMyDsl.g:237:1: ruleRightMotor : ( ( rule__RightMotor__Group__0 ) ) ;
    public final void ruleRightMotor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__RightMotor__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__RightMotor__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__RightMotor__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__RightMotor__Group__0 )
            {
             before(grammarAccess.getRightMotorAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__RightMotor__Group__0 )
            // InternalMyDsl.g:244:4: rule__RightMotor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RightMotor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRightMotorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRightMotor"


    // $ANTLR start "entryRuleEscape"
    // InternalMyDsl.g:253:1: entryRuleEscape : ruleEscape EOF ;
    public final void entryRuleEscape() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleEscape EOF )
            // InternalMyDsl.g:255:1: ruleEscape EOF
            {
             before(grammarAccess.getEscapeRule()); 
            pushFollow(FOLLOW_1);
            ruleEscape();

            state._fsp--;

             after(grammarAccess.getEscapeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEscape"


    // $ANTLR start "ruleEscape"
    // InternalMyDsl.g:262:1: ruleEscape : ( ( rule__Escape__Group__0 ) ) ;
    public final void ruleEscape() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Escape__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Escape__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Escape__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Escape__Group__0 )
            {
             before(grammarAccess.getEscapeAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Escape__Group__0 )
            // InternalMyDsl.g:269:4: rule__Escape__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Escape__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEscapeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEscape"


    // $ANTLR start "entryRuleHome"
    // InternalMyDsl.g:278:1: entryRuleHome : ruleHome EOF ;
    public final void entryRuleHome() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleHome EOF )
            // InternalMyDsl.g:280:1: ruleHome EOF
            {
             before(grammarAccess.getHomeRule()); 
            pushFollow(FOLLOW_1);
            ruleHome();

            state._fsp--;

             after(grammarAccess.getHomeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleHome"


    // $ANTLR start "ruleHome"
    // InternalMyDsl.g:287:1: ruleHome : ( ( rule__Home__Group__0 ) ) ;
    public final void ruleHome() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Home__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Home__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Home__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Home__Group__0 )
            {
             before(grammarAccess.getHomeAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Home__Group__0 )
            // InternalMyDsl.g:294:4: rule__Home__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHome"


    // $ANTLR start "entryRuleDistanceSensor"
    // InternalMyDsl.g:303:1: entryRuleDistanceSensor : ruleDistanceSensor EOF ;
    public final void entryRuleDistanceSensor() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleDistanceSensor EOF )
            // InternalMyDsl.g:305:1: ruleDistanceSensor EOF
            {
             before(grammarAccess.getDistanceSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleDistanceSensor();

            state._fsp--;

             after(grammarAccess.getDistanceSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDistanceSensor"


    // $ANTLR start "ruleDistanceSensor"
    // InternalMyDsl.g:312:1: ruleDistanceSensor : ( ( rule__DistanceSensor__Group__0 ) ) ;
    public final void ruleDistanceSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__DistanceSensor__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__DistanceSensor__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__DistanceSensor__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__DistanceSensor__Group__0 )
            {
             before(grammarAccess.getDistanceSensorAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__DistanceSensor__Group__0 )
            // InternalMyDsl.g:319:4: rule__DistanceSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DistanceSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDistanceSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDistanceSensor"


    // $ANTLR start "entryRuleLightSensor"
    // InternalMyDsl.g:328:1: entryRuleLightSensor : ruleLightSensor EOF ;
    public final void entryRuleLightSensor() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleLightSensor EOF )
            // InternalMyDsl.g:330:1: ruleLightSensor EOF
            {
             before(grammarAccess.getLightSensorRule()); 
            pushFollow(FOLLOW_1);
            ruleLightSensor();

            state._fsp--;

             after(grammarAccess.getLightSensorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLightSensor"


    // $ANTLR start "ruleLightSensor"
    // InternalMyDsl.g:337:1: ruleLightSensor : ( ( rule__LightSensor__Group__0 ) ) ;
    public final void ruleLightSensor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__LightSensor__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__LightSensor__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__LightSensor__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__LightSensor__Group__0 )
            {
             before(grammarAccess.getLightSensorAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__LightSensor__Group__0 )
            // InternalMyDsl.g:344:4: rule__LightSensor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LightSensor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLightSensorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLightSensor"


    // $ANTLR start "entryRuleEDouble"
    // InternalMyDsl.g:353:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleEDouble EOF )
            // InternalMyDsl.g:355:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalMyDsl.g:362:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__EDouble__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__EDouble__Group__0 )
            // InternalMyDsl.g:369:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:378:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleEInt EOF )
            // InternalMyDsl.g:380:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:387:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__EInt__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__EInt__Group__0 )
            // InternalMyDsl.g:394:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:403:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleEString EOF )
            // InternalMyDsl.g:405:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:412:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:419:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "rule__Actuator__Alternatives"
    // InternalMyDsl.g:427:1: rule__Actuator__Alternatives : ( ( ruleLeftMotor ) | ( ruleRightMotor ) );
    public final void rule__Actuator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( ( ruleLeftMotor ) | ( ruleRightMotor ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==27) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:432:2: ( ruleLeftMotor )
                    {
                    // InternalMyDsl.g:432:2: ( ruleLeftMotor )
                    // InternalMyDsl.g:433:3: ruleLeftMotor
                    {
                     before(grammarAccess.getActuatorAccess().getLeftMotorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLeftMotor();

                    state._fsp--;

                     after(grammarAccess.getActuatorAccess().getLeftMotorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:438:2: ( ruleRightMotor )
                    {
                    // InternalMyDsl.g:438:2: ( ruleRightMotor )
                    // InternalMyDsl.g:439:3: ruleRightMotor
                    {
                     before(grammarAccess.getActuatorAccess().getRightMotorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRightMotor();

                    state._fsp--;

                     after(grammarAccess.getActuatorAccess().getRightMotorParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Actuator__Alternatives"


    // $ANTLR start "rule__Behavior__Alternatives"
    // InternalMyDsl.g:448:1: rule__Behavior__Alternatives : ( ( ruleEscape ) | ( ruleHome ) );
    public final void rule__Behavior__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:452:1: ( ( ruleEscape ) | ( ruleHome ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==28) ) {
                alt2=1;
            }
            else if ( (LA2_0==30) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:453:2: ( ruleEscape )
                    {
                    // InternalMyDsl.g:453:2: ( ruleEscape )
                    // InternalMyDsl.g:454:3: ruleEscape
                    {
                     before(grammarAccess.getBehaviorAccess().getEscapeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleEscape();

                    state._fsp--;

                     after(grammarAccess.getBehaviorAccess().getEscapeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:459:2: ( ruleHome )
                    {
                    // InternalMyDsl.g:459:2: ( ruleHome )
                    // InternalMyDsl.g:460:3: ruleHome
                    {
                     before(grammarAccess.getBehaviorAccess().getHomeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleHome();

                    state._fsp--;

                     after(grammarAccess.getBehaviorAccess().getHomeParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Behavior__Alternatives"


    // $ANTLR start "rule__Sensor__Alternatives"
    // InternalMyDsl.g:469:1: rule__Sensor__Alternatives : ( ( ruleDistanceSensor ) | ( ruleLightSensor ) );
    public final void rule__Sensor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( ruleDistanceSensor ) | ( ruleLightSensor ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==31) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:474:2: ( ruleDistanceSensor )
                    {
                    // InternalMyDsl.g:474:2: ( ruleDistanceSensor )
                    // InternalMyDsl.g:475:3: ruleDistanceSensor
                    {
                     before(grammarAccess.getSensorAccess().getDistanceSensorParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDistanceSensor();

                    state._fsp--;

                     after(grammarAccess.getSensorAccess().getDistanceSensorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:480:2: ( ruleLightSensor )
                    {
                    // InternalMyDsl.g:480:2: ( ruleLightSensor )
                    // InternalMyDsl.g:481:3: ruleLightSensor
                    {
                     before(grammarAccess.getSensorAccess().getLightSensorParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLightSensor();

                    state._fsp--;

                     after(grammarAccess.getSensorAccess().getLightSensorParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sensor__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalMyDsl.g:490:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:494:1: ( ( 'E' ) | ( 'e' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:495:2: ( 'E' )
                    {
                    // InternalMyDsl.g:495:2: ( 'E' )
                    // InternalMyDsl.g:496:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:501:2: ( 'e' )
                    {
                    // InternalMyDsl.g:501:2: ( 'e' )
                    // InternalMyDsl.g:502:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:511:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:515:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:516:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:516:2: ( RULE_STRING )
                    // InternalMyDsl.g:517:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:522:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:522:2: ( RULE_ID )
                    // InternalMyDsl.g:523:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__RobotConfiguration__Group__0"
    // InternalMyDsl.g:532:1: rule__RobotConfiguration__Group__0 : rule__RobotConfiguration__Group__0__Impl rule__RobotConfiguration__Group__1 ;
    public final void rule__RobotConfiguration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:536:1: ( rule__RobotConfiguration__Group__0__Impl rule__RobotConfiguration__Group__1 )
            // InternalMyDsl.g:537:2: rule__RobotConfiguration__Group__0__Impl rule__RobotConfiguration__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RobotConfiguration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__0"


    // $ANTLR start "rule__RobotConfiguration__Group__0__Impl"
    // InternalMyDsl.g:544:1: rule__RobotConfiguration__Group__0__Impl : ( 'RobotConfiguration' ) ;
    public final void rule__RobotConfiguration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:548:1: ( ( 'RobotConfiguration' ) )
            // InternalMyDsl.g:549:1: ( 'RobotConfiguration' )
            {
            // InternalMyDsl.g:549:1: ( 'RobotConfiguration' )
            // InternalMyDsl.g:550:2: 'RobotConfiguration'
            {
             before(grammarAccess.getRobotConfigurationAccess().getRobotConfigurationKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRobotConfigurationAccess().getRobotConfigurationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__0__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group__1"
    // InternalMyDsl.g:559:1: rule__RobotConfiguration__Group__1 : rule__RobotConfiguration__Group__1__Impl rule__RobotConfiguration__Group__2 ;
    public final void rule__RobotConfiguration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:563:1: ( rule__RobotConfiguration__Group__1__Impl rule__RobotConfiguration__Group__2 )
            // InternalMyDsl.g:564:2: rule__RobotConfiguration__Group__1__Impl rule__RobotConfiguration__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RobotConfiguration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__1"


    // $ANTLR start "rule__RobotConfiguration__Group__1__Impl"
    // InternalMyDsl.g:571:1: rule__RobotConfiguration__Group__1__Impl : ( '{' ) ;
    public final void rule__RobotConfiguration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:575:1: ( ( '{' ) )
            // InternalMyDsl.g:576:1: ( '{' )
            {
            // InternalMyDsl.g:576:1: ( '{' )
            // InternalMyDsl.g:577:2: '{'
            {
             before(grammarAccess.getRobotConfigurationAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRobotConfigurationAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__1__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group__2"
    // InternalMyDsl.g:586:1: rule__RobotConfiguration__Group__2 : rule__RobotConfiguration__Group__2__Impl rule__RobotConfiguration__Group__3 ;
    public final void rule__RobotConfiguration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:590:1: ( rule__RobotConfiguration__Group__2__Impl rule__RobotConfiguration__Group__3 )
            // InternalMyDsl.g:591:2: rule__RobotConfiguration__Group__2__Impl rule__RobotConfiguration__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__RobotConfiguration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__2"


    // $ANTLR start "rule__RobotConfiguration__Group__2__Impl"
    // InternalMyDsl.g:598:1: rule__RobotConfiguration__Group__2__Impl : ( ( rule__RobotConfiguration__Group_2__0 )? ) ;
    public final void rule__RobotConfiguration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:602:1: ( ( ( rule__RobotConfiguration__Group_2__0 )? ) )
            // InternalMyDsl.g:603:1: ( ( rule__RobotConfiguration__Group_2__0 )? )
            {
            // InternalMyDsl.g:603:1: ( ( rule__RobotConfiguration__Group_2__0 )? )
            // InternalMyDsl.g:604:2: ( rule__RobotConfiguration__Group_2__0 )?
            {
             before(grammarAccess.getRobotConfigurationAccess().getGroup_2()); 
            // InternalMyDsl.g:605:2: ( rule__RobotConfiguration__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:605:3: rule__RobotConfiguration__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RobotConfiguration__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRobotConfigurationAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__2__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group__3"
    // InternalMyDsl.g:613:1: rule__RobotConfiguration__Group__3 : rule__RobotConfiguration__Group__3__Impl rule__RobotConfiguration__Group__4 ;
    public final void rule__RobotConfiguration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:617:1: ( rule__RobotConfiguration__Group__3__Impl rule__RobotConfiguration__Group__4 )
            // InternalMyDsl.g:618:2: rule__RobotConfiguration__Group__3__Impl rule__RobotConfiguration__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__RobotConfiguration__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__3"


    // $ANTLR start "rule__RobotConfiguration__Group__3__Impl"
    // InternalMyDsl.g:625:1: rule__RobotConfiguration__Group__3__Impl : ( ( rule__RobotConfiguration__Group_3__0 )? ) ;
    public final void rule__RobotConfiguration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:629:1: ( ( ( rule__RobotConfiguration__Group_3__0 )? ) )
            // InternalMyDsl.g:630:1: ( ( rule__RobotConfiguration__Group_3__0 )? )
            {
            // InternalMyDsl.g:630:1: ( ( rule__RobotConfiguration__Group_3__0 )? )
            // InternalMyDsl.g:631:2: ( rule__RobotConfiguration__Group_3__0 )?
            {
             before(grammarAccess.getRobotConfigurationAccess().getGroup_3()); 
            // InternalMyDsl.g:632:2: ( rule__RobotConfiguration__Group_3__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:632:3: rule__RobotConfiguration__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RobotConfiguration__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRobotConfigurationAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__3__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group__4"
    // InternalMyDsl.g:640:1: rule__RobotConfiguration__Group__4 : rule__RobotConfiguration__Group__4__Impl rule__RobotConfiguration__Group__5 ;
    public final void rule__RobotConfiguration__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:644:1: ( rule__RobotConfiguration__Group__4__Impl rule__RobotConfiguration__Group__5 )
            // InternalMyDsl.g:645:2: rule__RobotConfiguration__Group__4__Impl rule__RobotConfiguration__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__RobotConfiguration__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__4"


    // $ANTLR start "rule__RobotConfiguration__Group__4__Impl"
    // InternalMyDsl.g:652:1: rule__RobotConfiguration__Group__4__Impl : ( 'robot' ) ;
    public final void rule__RobotConfiguration__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:656:1: ( ( 'robot' ) )
            // InternalMyDsl.g:657:1: ( 'robot' )
            {
            // InternalMyDsl.g:657:1: ( 'robot' )
            // InternalMyDsl.g:658:2: 'robot'
            {
             before(grammarAccess.getRobotConfigurationAccess().getRobotKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRobotConfigurationAccess().getRobotKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__4__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group__5"
    // InternalMyDsl.g:667:1: rule__RobotConfiguration__Group__5 : rule__RobotConfiguration__Group__5__Impl rule__RobotConfiguration__Group__6 ;
    public final void rule__RobotConfiguration__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:671:1: ( rule__RobotConfiguration__Group__5__Impl rule__RobotConfiguration__Group__6 )
            // InternalMyDsl.g:672:2: rule__RobotConfiguration__Group__5__Impl rule__RobotConfiguration__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__RobotConfiguration__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__5"


    // $ANTLR start "rule__RobotConfiguration__Group__5__Impl"
    // InternalMyDsl.g:679:1: rule__RobotConfiguration__Group__5__Impl : ( ':' ) ;
    public final void rule__RobotConfiguration__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:683:1: ( ( ':' ) )
            // InternalMyDsl.g:684:1: ( ':' )
            {
            // InternalMyDsl.g:684:1: ( ':' )
            // InternalMyDsl.g:685:2: ':'
            {
             before(grammarAccess.getRobotConfigurationAccess().getColonKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRobotConfigurationAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__5__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group__6"
    // InternalMyDsl.g:694:1: rule__RobotConfiguration__Group__6 : rule__RobotConfiguration__Group__6__Impl rule__RobotConfiguration__Group__7 ;
    public final void rule__RobotConfiguration__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:698:1: ( rule__RobotConfiguration__Group__6__Impl rule__RobotConfiguration__Group__7 )
            // InternalMyDsl.g:699:2: rule__RobotConfiguration__Group__6__Impl rule__RobotConfiguration__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__RobotConfiguration__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__6"


    // $ANTLR start "rule__RobotConfiguration__Group__6__Impl"
    // InternalMyDsl.g:706:1: rule__RobotConfiguration__Group__6__Impl : ( ( rule__RobotConfiguration__RobotAssignment_6 ) ) ;
    public final void rule__RobotConfiguration__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:710:1: ( ( ( rule__RobotConfiguration__RobotAssignment_6 ) ) )
            // InternalMyDsl.g:711:1: ( ( rule__RobotConfiguration__RobotAssignment_6 ) )
            {
            // InternalMyDsl.g:711:1: ( ( rule__RobotConfiguration__RobotAssignment_6 ) )
            // InternalMyDsl.g:712:2: ( rule__RobotConfiguration__RobotAssignment_6 )
            {
             before(grammarAccess.getRobotConfigurationAccess().getRobotAssignment_6()); 
            // InternalMyDsl.g:713:2: ( rule__RobotConfiguration__RobotAssignment_6 )
            // InternalMyDsl.g:713:3: rule__RobotConfiguration__RobotAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__RobotAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRobotConfigurationAccess().getRobotAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__6__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group__7"
    // InternalMyDsl.g:721:1: rule__RobotConfiguration__Group__7 : rule__RobotConfiguration__Group__7__Impl rule__RobotConfiguration__Group__8 ;
    public final void rule__RobotConfiguration__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:725:1: ( rule__RobotConfiguration__Group__7__Impl rule__RobotConfiguration__Group__8 )
            // InternalMyDsl.g:726:2: rule__RobotConfiguration__Group__7__Impl rule__RobotConfiguration__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__RobotConfiguration__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__7"


    // $ANTLR start "rule__RobotConfiguration__Group__7__Impl"
    // InternalMyDsl.g:733:1: rule__RobotConfiguration__Group__7__Impl : ( ( rule__RobotConfiguration__Group_7__0 )? ) ;
    public final void rule__RobotConfiguration__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:737:1: ( ( ( rule__RobotConfiguration__Group_7__0 )? ) )
            // InternalMyDsl.g:738:1: ( ( rule__RobotConfiguration__Group_7__0 )? )
            {
            // InternalMyDsl.g:738:1: ( ( rule__RobotConfiguration__Group_7__0 )? )
            // InternalMyDsl.g:739:2: ( rule__RobotConfiguration__Group_7__0 )?
            {
             before(grammarAccess.getRobotConfigurationAccess().getGroup_7()); 
            // InternalMyDsl.g:740:2: ( rule__RobotConfiguration__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:740:3: rule__RobotConfiguration__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RobotConfiguration__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRobotConfigurationAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__7__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group__8"
    // InternalMyDsl.g:748:1: rule__RobotConfiguration__Group__8 : rule__RobotConfiguration__Group__8__Impl ;
    public final void rule__RobotConfiguration__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:752:1: ( rule__RobotConfiguration__Group__8__Impl )
            // InternalMyDsl.g:753:2: rule__RobotConfiguration__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__8"


    // $ANTLR start "rule__RobotConfiguration__Group__8__Impl"
    // InternalMyDsl.g:759:1: rule__RobotConfiguration__Group__8__Impl : ( '}' ) ;
    public final void rule__RobotConfiguration__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:763:1: ( ( '}' ) )
            // InternalMyDsl.g:764:1: ( '}' )
            {
            // InternalMyDsl.g:764:1: ( '}' )
            // InternalMyDsl.g:765:2: '}'
            {
             before(grammarAccess.getRobotConfigurationAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRobotConfigurationAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group__8__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group_2__0"
    // InternalMyDsl.g:775:1: rule__RobotConfiguration__Group_2__0 : rule__RobotConfiguration__Group_2__0__Impl rule__RobotConfiguration__Group_2__1 ;
    public final void rule__RobotConfiguration__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:779:1: ( rule__RobotConfiguration__Group_2__0__Impl rule__RobotConfiguration__Group_2__1 )
            // InternalMyDsl.g:780:2: rule__RobotConfiguration__Group_2__0__Impl rule__RobotConfiguration__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__RobotConfiguration__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_2__0"


    // $ANTLR start "rule__RobotConfiguration__Group_2__0__Impl"
    // InternalMyDsl.g:787:1: rule__RobotConfiguration__Group_2__0__Impl : ( 'MAX_SPEED' ) ;
    public final void rule__RobotConfiguration__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:1: ( ( 'MAX_SPEED' ) )
            // InternalMyDsl.g:792:1: ( 'MAX_SPEED' )
            {
            // InternalMyDsl.g:792:1: ( 'MAX_SPEED' )
            // InternalMyDsl.g:793:2: 'MAX_SPEED'
            {
             before(grammarAccess.getRobotConfigurationAccess().getMAX_SPEEDKeyword_2_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRobotConfigurationAccess().getMAX_SPEEDKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_2__0__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group_2__1"
    // InternalMyDsl.g:802:1: rule__RobotConfiguration__Group_2__1 : rule__RobotConfiguration__Group_2__1__Impl rule__RobotConfiguration__Group_2__2 ;
    public final void rule__RobotConfiguration__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:806:1: ( rule__RobotConfiguration__Group_2__1__Impl rule__RobotConfiguration__Group_2__2 )
            // InternalMyDsl.g:807:2: rule__RobotConfiguration__Group_2__1__Impl rule__RobotConfiguration__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__RobotConfiguration__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_2__1"


    // $ANTLR start "rule__RobotConfiguration__Group_2__1__Impl"
    // InternalMyDsl.g:814:1: rule__RobotConfiguration__Group_2__1__Impl : ( ':' ) ;
    public final void rule__RobotConfiguration__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:818:1: ( ( ':' ) )
            // InternalMyDsl.g:819:1: ( ':' )
            {
            // InternalMyDsl.g:819:1: ( ':' )
            // InternalMyDsl.g:820:2: ':'
            {
             before(grammarAccess.getRobotConfigurationAccess().getColonKeyword_2_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRobotConfigurationAccess().getColonKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_2__1__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group_2__2"
    // InternalMyDsl.g:829:1: rule__RobotConfiguration__Group_2__2 : rule__RobotConfiguration__Group_2__2__Impl ;
    public final void rule__RobotConfiguration__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:833:1: ( rule__RobotConfiguration__Group_2__2__Impl )
            // InternalMyDsl.g:834:2: rule__RobotConfiguration__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_2__2"


    // $ANTLR start "rule__RobotConfiguration__Group_2__2__Impl"
    // InternalMyDsl.g:840:1: rule__RobotConfiguration__Group_2__2__Impl : ( ( rule__RobotConfiguration__MAX_SPEEDAssignment_2_2 ) ) ;
    public final void rule__RobotConfiguration__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:844:1: ( ( ( rule__RobotConfiguration__MAX_SPEEDAssignment_2_2 ) ) )
            // InternalMyDsl.g:845:1: ( ( rule__RobotConfiguration__MAX_SPEEDAssignment_2_2 ) )
            {
            // InternalMyDsl.g:845:1: ( ( rule__RobotConfiguration__MAX_SPEEDAssignment_2_2 ) )
            // InternalMyDsl.g:846:2: ( rule__RobotConfiguration__MAX_SPEEDAssignment_2_2 )
            {
             before(grammarAccess.getRobotConfigurationAccess().getMAX_SPEEDAssignment_2_2()); 
            // InternalMyDsl.g:847:2: ( rule__RobotConfiguration__MAX_SPEEDAssignment_2_2 )
            // InternalMyDsl.g:847:3: rule__RobotConfiguration__MAX_SPEEDAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__MAX_SPEEDAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotConfigurationAccess().getMAX_SPEEDAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_2__2__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group_3__0"
    // InternalMyDsl.g:856:1: rule__RobotConfiguration__Group_3__0 : rule__RobotConfiguration__Group_3__0__Impl rule__RobotConfiguration__Group_3__1 ;
    public final void rule__RobotConfiguration__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:860:1: ( rule__RobotConfiguration__Group_3__0__Impl rule__RobotConfiguration__Group_3__1 )
            // InternalMyDsl.g:861:2: rule__RobotConfiguration__Group_3__0__Impl rule__RobotConfiguration__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__RobotConfiguration__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_3__0"


    // $ANTLR start "rule__RobotConfiguration__Group_3__0__Impl"
    // InternalMyDsl.g:868:1: rule__RobotConfiguration__Group_3__0__Impl : ( 'TIME_STEP' ) ;
    public final void rule__RobotConfiguration__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:872:1: ( ( 'TIME_STEP' ) )
            // InternalMyDsl.g:873:1: ( 'TIME_STEP' )
            {
            // InternalMyDsl.g:873:1: ( 'TIME_STEP' )
            // InternalMyDsl.g:874:2: 'TIME_STEP'
            {
             before(grammarAccess.getRobotConfigurationAccess().getTIME_STEPKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRobotConfigurationAccess().getTIME_STEPKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_3__0__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group_3__1"
    // InternalMyDsl.g:883:1: rule__RobotConfiguration__Group_3__1 : rule__RobotConfiguration__Group_3__1__Impl rule__RobotConfiguration__Group_3__2 ;
    public final void rule__RobotConfiguration__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:887:1: ( rule__RobotConfiguration__Group_3__1__Impl rule__RobotConfiguration__Group_3__2 )
            // InternalMyDsl.g:888:2: rule__RobotConfiguration__Group_3__1__Impl rule__RobotConfiguration__Group_3__2
            {
            pushFollow(FOLLOW_9);
            rule__RobotConfiguration__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_3__1"


    // $ANTLR start "rule__RobotConfiguration__Group_3__1__Impl"
    // InternalMyDsl.g:895:1: rule__RobotConfiguration__Group_3__1__Impl : ( ':' ) ;
    public final void rule__RobotConfiguration__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:899:1: ( ( ':' ) )
            // InternalMyDsl.g:900:1: ( ':' )
            {
            // InternalMyDsl.g:900:1: ( ':' )
            // InternalMyDsl.g:901:2: ':'
            {
             before(grammarAccess.getRobotConfigurationAccess().getColonKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRobotConfigurationAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_3__1__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group_3__2"
    // InternalMyDsl.g:910:1: rule__RobotConfiguration__Group_3__2 : rule__RobotConfiguration__Group_3__2__Impl ;
    public final void rule__RobotConfiguration__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:914:1: ( rule__RobotConfiguration__Group_3__2__Impl )
            // InternalMyDsl.g:915:2: rule__RobotConfiguration__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_3__2"


    // $ANTLR start "rule__RobotConfiguration__Group_3__2__Impl"
    // InternalMyDsl.g:921:1: rule__RobotConfiguration__Group_3__2__Impl : ( ( rule__RobotConfiguration__TIME_STEPAssignment_3_2 ) ) ;
    public final void rule__RobotConfiguration__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:925:1: ( ( ( rule__RobotConfiguration__TIME_STEPAssignment_3_2 ) ) )
            // InternalMyDsl.g:926:1: ( ( rule__RobotConfiguration__TIME_STEPAssignment_3_2 ) )
            {
            // InternalMyDsl.g:926:1: ( ( rule__RobotConfiguration__TIME_STEPAssignment_3_2 ) )
            // InternalMyDsl.g:927:2: ( rule__RobotConfiguration__TIME_STEPAssignment_3_2 )
            {
             before(grammarAccess.getRobotConfigurationAccess().getTIME_STEPAssignment_3_2()); 
            // InternalMyDsl.g:928:2: ( rule__RobotConfiguration__TIME_STEPAssignment_3_2 )
            // InternalMyDsl.g:928:3: rule__RobotConfiguration__TIME_STEPAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__TIME_STEPAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotConfigurationAccess().getTIME_STEPAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_3__2__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group_7__0"
    // InternalMyDsl.g:937:1: rule__RobotConfiguration__Group_7__0 : rule__RobotConfiguration__Group_7__0__Impl rule__RobotConfiguration__Group_7__1 ;
    public final void rule__RobotConfiguration__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:1: ( rule__RobotConfiguration__Group_7__0__Impl rule__RobotConfiguration__Group_7__1 )
            // InternalMyDsl.g:942:2: rule__RobotConfiguration__Group_7__0__Impl rule__RobotConfiguration__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__RobotConfiguration__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_7__0"


    // $ANTLR start "rule__RobotConfiguration__Group_7__0__Impl"
    // InternalMyDsl.g:949:1: rule__RobotConfiguration__Group_7__0__Impl : ( 'mission' ) ;
    public final void rule__RobotConfiguration__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:953:1: ( ( 'mission' ) )
            // InternalMyDsl.g:954:1: ( 'mission' )
            {
            // InternalMyDsl.g:954:1: ( 'mission' )
            // InternalMyDsl.g:955:2: 'mission'
            {
             before(grammarAccess.getRobotConfigurationAccess().getMissionKeyword_7_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRobotConfigurationAccess().getMissionKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_7__0__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group_7__1"
    // InternalMyDsl.g:964:1: rule__RobotConfiguration__Group_7__1 : rule__RobotConfiguration__Group_7__1__Impl rule__RobotConfiguration__Group_7__2 ;
    public final void rule__RobotConfiguration__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( rule__RobotConfiguration__Group_7__1__Impl rule__RobotConfiguration__Group_7__2 )
            // InternalMyDsl.g:969:2: rule__RobotConfiguration__Group_7__1__Impl rule__RobotConfiguration__Group_7__2
            {
            pushFollow(FOLLOW_10);
            rule__RobotConfiguration__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_7__1"


    // $ANTLR start "rule__RobotConfiguration__Group_7__1__Impl"
    // InternalMyDsl.g:976:1: rule__RobotConfiguration__Group_7__1__Impl : ( ':' ) ;
    public final void rule__RobotConfiguration__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:980:1: ( ( ':' ) )
            // InternalMyDsl.g:981:1: ( ':' )
            {
            // InternalMyDsl.g:981:1: ( ':' )
            // InternalMyDsl.g:982:2: ':'
            {
             before(grammarAccess.getRobotConfigurationAccess().getColonKeyword_7_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRobotConfigurationAccess().getColonKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_7__1__Impl"


    // $ANTLR start "rule__RobotConfiguration__Group_7__2"
    // InternalMyDsl.g:991:1: rule__RobotConfiguration__Group_7__2 : rule__RobotConfiguration__Group_7__2__Impl ;
    public final void rule__RobotConfiguration__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:995:1: ( rule__RobotConfiguration__Group_7__2__Impl )
            // InternalMyDsl.g:996:2: rule__RobotConfiguration__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__Group_7__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_7__2"


    // $ANTLR start "rule__RobotConfiguration__Group_7__2__Impl"
    // InternalMyDsl.g:1002:1: rule__RobotConfiguration__Group_7__2__Impl : ( ( rule__RobotConfiguration__MissionAssignment_7_2 ) ) ;
    public final void rule__RobotConfiguration__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1006:1: ( ( ( rule__RobotConfiguration__MissionAssignment_7_2 ) ) )
            // InternalMyDsl.g:1007:1: ( ( rule__RobotConfiguration__MissionAssignment_7_2 ) )
            {
            // InternalMyDsl.g:1007:1: ( ( rule__RobotConfiguration__MissionAssignment_7_2 ) )
            // InternalMyDsl.g:1008:2: ( rule__RobotConfiguration__MissionAssignment_7_2 )
            {
             before(grammarAccess.getRobotConfigurationAccess().getMissionAssignment_7_2()); 
            // InternalMyDsl.g:1009:2: ( rule__RobotConfiguration__MissionAssignment_7_2 )
            // InternalMyDsl.g:1009:3: rule__RobotConfiguration__MissionAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__RobotConfiguration__MissionAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotConfigurationAccess().getMissionAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__Group_7__2__Impl"


    // $ANTLR start "rule__Robot__Group__0"
    // InternalMyDsl.g:1018:1: rule__Robot__Group__0 : rule__Robot__Group__0__Impl rule__Robot__Group__1 ;
    public final void rule__Robot__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( rule__Robot__Group__0__Impl rule__Robot__Group__1 )
            // InternalMyDsl.g:1023:2: rule__Robot__Group__0__Impl rule__Robot__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Robot__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0"


    // $ANTLR start "rule__Robot__Group__0__Impl"
    // InternalMyDsl.g:1030:1: rule__Robot__Group__0__Impl : ( () ) ;
    public final void rule__Robot__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1034:1: ( ( () ) )
            // InternalMyDsl.g:1035:1: ( () )
            {
            // InternalMyDsl.g:1035:1: ( () )
            // InternalMyDsl.g:1036:2: ()
            {
             before(grammarAccess.getRobotAccess().getRobotAction_0()); 
            // InternalMyDsl.g:1037:2: ()
            // InternalMyDsl.g:1037:3: 
            {
            }

             after(grammarAccess.getRobotAccess().getRobotAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__0__Impl"


    // $ANTLR start "rule__Robot__Group__1"
    // InternalMyDsl.g:1045:1: rule__Robot__Group__1 : rule__Robot__Group__1__Impl rule__Robot__Group__2 ;
    public final void rule__Robot__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( rule__Robot__Group__1__Impl rule__Robot__Group__2 )
            // InternalMyDsl.g:1050:2: rule__Robot__Group__1__Impl rule__Robot__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Robot__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1"


    // $ANTLR start "rule__Robot__Group__1__Impl"
    // InternalMyDsl.g:1057:1: rule__Robot__Group__1__Impl : ( 'Robot' ) ;
    public final void rule__Robot__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1061:1: ( ( 'Robot' ) )
            // InternalMyDsl.g:1062:1: ( 'Robot' )
            {
            // InternalMyDsl.g:1062:1: ( 'Robot' )
            // InternalMyDsl.g:1063:2: 'Robot'
            {
             before(grammarAccess.getRobotAccess().getRobotKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRobotKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__1__Impl"


    // $ANTLR start "rule__Robot__Group__2"
    // InternalMyDsl.g:1072:1: rule__Robot__Group__2 : rule__Robot__Group__2__Impl rule__Robot__Group__3 ;
    public final void rule__Robot__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( rule__Robot__Group__2__Impl rule__Robot__Group__3 )
            // InternalMyDsl.g:1077:2: rule__Robot__Group__2__Impl rule__Robot__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Robot__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2"


    // $ANTLR start "rule__Robot__Group__2__Impl"
    // InternalMyDsl.g:1084:1: rule__Robot__Group__2__Impl : ( ( rule__Robot__NameAssignment_2 ) ) ;
    public final void rule__Robot__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1088:1: ( ( ( rule__Robot__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1089:1: ( ( rule__Robot__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1089:1: ( ( rule__Robot__NameAssignment_2 ) )
            // InternalMyDsl.g:1090:2: ( rule__Robot__NameAssignment_2 )
            {
             before(grammarAccess.getRobotAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1091:2: ( rule__Robot__NameAssignment_2 )
            // InternalMyDsl.g:1091:3: rule__Robot__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Robot__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__2__Impl"


    // $ANTLR start "rule__Robot__Group__3"
    // InternalMyDsl.g:1099:1: rule__Robot__Group__3 : rule__Robot__Group__3__Impl rule__Robot__Group__4 ;
    public final void rule__Robot__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1103:1: ( rule__Robot__Group__3__Impl rule__Robot__Group__4 )
            // InternalMyDsl.g:1104:2: rule__Robot__Group__3__Impl rule__Robot__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Robot__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3"


    // $ANTLR start "rule__Robot__Group__3__Impl"
    // InternalMyDsl.g:1111:1: rule__Robot__Group__3__Impl : ( '{' ) ;
    public final void rule__Robot__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1115:1: ( ( '{' ) )
            // InternalMyDsl.g:1116:1: ( '{' )
            {
            // InternalMyDsl.g:1116:1: ( '{' )
            // InternalMyDsl.g:1117:2: '{'
            {
             before(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__3__Impl"


    // $ANTLR start "rule__Robot__Group__4"
    // InternalMyDsl.g:1126:1: rule__Robot__Group__4 : rule__Robot__Group__4__Impl rule__Robot__Group__5 ;
    public final void rule__Robot__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1130:1: ( rule__Robot__Group__4__Impl rule__Robot__Group__5 )
            // InternalMyDsl.g:1131:2: rule__Robot__Group__4__Impl rule__Robot__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Robot__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__4"


    // $ANTLR start "rule__Robot__Group__4__Impl"
    // InternalMyDsl.g:1138:1: rule__Robot__Group__4__Impl : ( ( rule__Robot__Group_4__0 )? ) ;
    public final void rule__Robot__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1142:1: ( ( ( rule__Robot__Group_4__0 )? ) )
            // InternalMyDsl.g:1143:1: ( ( rule__Robot__Group_4__0 )? )
            {
            // InternalMyDsl.g:1143:1: ( ( rule__Robot__Group_4__0 )? )
            // InternalMyDsl.g:1144:2: ( rule__Robot__Group_4__0 )?
            {
             before(grammarAccess.getRobotAccess().getGroup_4()); 
            // InternalMyDsl.g:1145:2: ( rule__Robot__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1145:3: rule__Robot__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Robot__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRobotAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__4__Impl"


    // $ANTLR start "rule__Robot__Group__5"
    // InternalMyDsl.g:1153:1: rule__Robot__Group__5 : rule__Robot__Group__5__Impl ;
    public final void rule__Robot__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1157:1: ( rule__Robot__Group__5__Impl )
            // InternalMyDsl.g:1158:2: rule__Robot__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__5"


    // $ANTLR start "rule__Robot__Group__5__Impl"
    // InternalMyDsl.g:1164:1: rule__Robot__Group__5__Impl : ( '}' ) ;
    public final void rule__Robot__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1168:1: ( ( '}' ) )
            // InternalMyDsl.g:1169:1: ( '}' )
            {
            // InternalMyDsl.g:1169:1: ( '}' )
            // InternalMyDsl.g:1170:2: '}'
            {
             before(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group__5__Impl"


    // $ANTLR start "rule__Robot__Group_4__0"
    // InternalMyDsl.g:1180:1: rule__Robot__Group_4__0 : rule__Robot__Group_4__0__Impl rule__Robot__Group_4__1 ;
    public final void rule__Robot__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1184:1: ( rule__Robot__Group_4__0__Impl rule__Robot__Group_4__1 )
            // InternalMyDsl.g:1185:2: rule__Robot__Group_4__0__Impl rule__Robot__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Robot__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__0"


    // $ANTLR start "rule__Robot__Group_4__0__Impl"
    // InternalMyDsl.g:1192:1: rule__Robot__Group_4__0__Impl : ( 'actuators' ) ;
    public final void rule__Robot__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1196:1: ( ( 'actuators' ) )
            // InternalMyDsl.g:1197:1: ( 'actuators' )
            {
            // InternalMyDsl.g:1197:1: ( 'actuators' )
            // InternalMyDsl.g:1198:2: 'actuators'
            {
             before(grammarAccess.getRobotAccess().getActuatorsKeyword_4_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getActuatorsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__0__Impl"


    // $ANTLR start "rule__Robot__Group_4__1"
    // InternalMyDsl.g:1207:1: rule__Robot__Group_4__1 : rule__Robot__Group_4__1__Impl rule__Robot__Group_4__2 ;
    public final void rule__Robot__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( rule__Robot__Group_4__1__Impl rule__Robot__Group_4__2 )
            // InternalMyDsl.g:1212:2: rule__Robot__Group_4__1__Impl rule__Robot__Group_4__2
            {
            pushFollow(FOLLOW_13);
            rule__Robot__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__1"


    // $ANTLR start "rule__Robot__Group_4__1__Impl"
    // InternalMyDsl.g:1219:1: rule__Robot__Group_4__1__Impl : ( ':' ) ;
    public final void rule__Robot__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1223:1: ( ( ':' ) )
            // InternalMyDsl.g:1224:1: ( ':' )
            {
            // InternalMyDsl.g:1224:1: ( ':' )
            // InternalMyDsl.g:1225:2: ':'
            {
             before(grammarAccess.getRobotAccess().getColonKeyword_4_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getColonKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__1__Impl"


    // $ANTLR start "rule__Robot__Group_4__2"
    // InternalMyDsl.g:1234:1: rule__Robot__Group_4__2 : rule__Robot__Group_4__2__Impl rule__Robot__Group_4__3 ;
    public final void rule__Robot__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( rule__Robot__Group_4__2__Impl rule__Robot__Group_4__3 )
            // InternalMyDsl.g:1239:2: rule__Robot__Group_4__2__Impl rule__Robot__Group_4__3
            {
            pushFollow(FOLLOW_14);
            rule__Robot__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__2"


    // $ANTLR start "rule__Robot__Group_4__2__Impl"
    // InternalMyDsl.g:1246:1: rule__Robot__Group_4__2__Impl : ( ( rule__Robot__ActuatorsAssignment_4_2 ) ) ;
    public final void rule__Robot__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1250:1: ( ( ( rule__Robot__ActuatorsAssignment_4_2 ) ) )
            // InternalMyDsl.g:1251:1: ( ( rule__Robot__ActuatorsAssignment_4_2 ) )
            {
            // InternalMyDsl.g:1251:1: ( ( rule__Robot__ActuatorsAssignment_4_2 ) )
            // InternalMyDsl.g:1252:2: ( rule__Robot__ActuatorsAssignment_4_2 )
            {
             before(grammarAccess.getRobotAccess().getActuatorsAssignment_4_2()); 
            // InternalMyDsl.g:1253:2: ( rule__Robot__ActuatorsAssignment_4_2 )
            // InternalMyDsl.g:1253:3: rule__Robot__ActuatorsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Robot__ActuatorsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getActuatorsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__2__Impl"


    // $ANTLR start "rule__Robot__Group_4__3"
    // InternalMyDsl.g:1261:1: rule__Robot__Group_4__3 : rule__Robot__Group_4__3__Impl ;
    public final void rule__Robot__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( rule__Robot__Group_4__3__Impl )
            // InternalMyDsl.g:1266:2: rule__Robot__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__3"


    // $ANTLR start "rule__Robot__Group_4__3__Impl"
    // InternalMyDsl.g:1272:1: rule__Robot__Group_4__3__Impl : ( ( rule__Robot__Group_4_3__0 )* ) ;
    public final void rule__Robot__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1276:1: ( ( ( rule__Robot__Group_4_3__0 )* ) )
            // InternalMyDsl.g:1277:1: ( ( rule__Robot__Group_4_3__0 )* )
            {
            // InternalMyDsl.g:1277:1: ( ( rule__Robot__Group_4_3__0 )* )
            // InternalMyDsl.g:1278:2: ( rule__Robot__Group_4_3__0 )*
            {
             before(grammarAccess.getRobotAccess().getGroup_4_3()); 
            // InternalMyDsl.g:1279:2: ( rule__Robot__Group_4_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1279:3: rule__Robot__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Robot__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getRobotAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4__3__Impl"


    // $ANTLR start "rule__Robot__Group_4_3__0"
    // InternalMyDsl.g:1288:1: rule__Robot__Group_4_3__0 : rule__Robot__Group_4_3__0__Impl rule__Robot__Group_4_3__1 ;
    public final void rule__Robot__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1292:1: ( rule__Robot__Group_4_3__0__Impl rule__Robot__Group_4_3__1 )
            // InternalMyDsl.g:1293:2: rule__Robot__Group_4_3__0__Impl rule__Robot__Group_4_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Robot__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Robot__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4_3__0"


    // $ANTLR start "rule__Robot__Group_4_3__0__Impl"
    // InternalMyDsl.g:1300:1: rule__Robot__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Robot__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1304:1: ( ( ',' ) )
            // InternalMyDsl.g:1305:1: ( ',' )
            {
            // InternalMyDsl.g:1305:1: ( ',' )
            // InternalMyDsl.g:1306:2: ','
            {
             before(grammarAccess.getRobotAccess().getCommaKeyword_4_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRobotAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4_3__0__Impl"


    // $ANTLR start "rule__Robot__Group_4_3__1"
    // InternalMyDsl.g:1315:1: rule__Robot__Group_4_3__1 : rule__Robot__Group_4_3__1__Impl ;
    public final void rule__Robot__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1319:1: ( rule__Robot__Group_4_3__1__Impl )
            // InternalMyDsl.g:1320:2: rule__Robot__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Robot__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4_3__1"


    // $ANTLR start "rule__Robot__Group_4_3__1__Impl"
    // InternalMyDsl.g:1326:1: rule__Robot__Group_4_3__1__Impl : ( ( rule__Robot__ActuatorsAssignment_4_3_1 ) ) ;
    public final void rule__Robot__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1330:1: ( ( ( rule__Robot__ActuatorsAssignment_4_3_1 ) ) )
            // InternalMyDsl.g:1331:1: ( ( rule__Robot__ActuatorsAssignment_4_3_1 ) )
            {
            // InternalMyDsl.g:1331:1: ( ( rule__Robot__ActuatorsAssignment_4_3_1 ) )
            // InternalMyDsl.g:1332:2: ( rule__Robot__ActuatorsAssignment_4_3_1 )
            {
             before(grammarAccess.getRobotAccess().getActuatorsAssignment_4_3_1()); 
            // InternalMyDsl.g:1333:2: ( rule__Robot__ActuatorsAssignment_4_3_1 )
            // InternalMyDsl.g:1333:3: rule__Robot__ActuatorsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Robot__ActuatorsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRobotAccess().getActuatorsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__Group_4_3__1__Impl"


    // $ANTLR start "rule__Mission__Group__0"
    // InternalMyDsl.g:1342:1: rule__Mission__Group__0 : rule__Mission__Group__0__Impl rule__Mission__Group__1 ;
    public final void rule__Mission__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1346:1: ( rule__Mission__Group__0__Impl rule__Mission__Group__1 )
            // InternalMyDsl.g:1347:2: rule__Mission__Group__0__Impl rule__Mission__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Mission__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0"


    // $ANTLR start "rule__Mission__Group__0__Impl"
    // InternalMyDsl.g:1354:1: rule__Mission__Group__0__Impl : ( ( rule__Mission__FinishedAssignment_0 )? ) ;
    public final void rule__Mission__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1358:1: ( ( ( rule__Mission__FinishedAssignment_0 )? ) )
            // InternalMyDsl.g:1359:1: ( ( rule__Mission__FinishedAssignment_0 )? )
            {
            // InternalMyDsl.g:1359:1: ( ( rule__Mission__FinishedAssignment_0 )? )
            // InternalMyDsl.g:1360:2: ( rule__Mission__FinishedAssignment_0 )?
            {
             before(grammarAccess.getMissionAccess().getFinishedAssignment_0()); 
            // InternalMyDsl.g:1361:2: ( rule__Mission__FinishedAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1361:3: rule__Mission__FinishedAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mission__FinishedAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMissionAccess().getFinishedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__0__Impl"


    // $ANTLR start "rule__Mission__Group__1"
    // InternalMyDsl.g:1369:1: rule__Mission__Group__1 : rule__Mission__Group__1__Impl rule__Mission__Group__2 ;
    public final void rule__Mission__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1373:1: ( rule__Mission__Group__1__Impl rule__Mission__Group__2 )
            // InternalMyDsl.g:1374:2: rule__Mission__Group__1__Impl rule__Mission__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Mission__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1"


    // $ANTLR start "rule__Mission__Group__1__Impl"
    // InternalMyDsl.g:1381:1: rule__Mission__Group__1__Impl : ( 'Mission' ) ;
    public final void rule__Mission__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1385:1: ( ( 'Mission' ) )
            // InternalMyDsl.g:1386:1: ( 'Mission' )
            {
            // InternalMyDsl.g:1386:1: ( 'Mission' )
            // InternalMyDsl.g:1387:2: 'Mission'
            {
             before(grammarAccess.getMissionAccess().getMissionKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getMissionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__1__Impl"


    // $ANTLR start "rule__Mission__Group__2"
    // InternalMyDsl.g:1396:1: rule__Mission__Group__2 : rule__Mission__Group__2__Impl rule__Mission__Group__3 ;
    public final void rule__Mission__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1400:1: ( rule__Mission__Group__2__Impl rule__Mission__Group__3 )
            // InternalMyDsl.g:1401:2: rule__Mission__Group__2__Impl rule__Mission__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Mission__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2"


    // $ANTLR start "rule__Mission__Group__2__Impl"
    // InternalMyDsl.g:1408:1: rule__Mission__Group__2__Impl : ( ( rule__Mission__NameAssignment_2 ) ) ;
    public final void rule__Mission__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1412:1: ( ( ( rule__Mission__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1413:1: ( ( rule__Mission__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1413:1: ( ( rule__Mission__NameAssignment_2 ) )
            // InternalMyDsl.g:1414:2: ( rule__Mission__NameAssignment_2 )
            {
             before(grammarAccess.getMissionAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1415:2: ( rule__Mission__NameAssignment_2 )
            // InternalMyDsl.g:1415:3: rule__Mission__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mission__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__2__Impl"


    // $ANTLR start "rule__Mission__Group__3"
    // InternalMyDsl.g:1423:1: rule__Mission__Group__3 : rule__Mission__Group__3__Impl rule__Mission__Group__4 ;
    public final void rule__Mission__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1427:1: ( rule__Mission__Group__3__Impl rule__Mission__Group__4 )
            // InternalMyDsl.g:1428:2: rule__Mission__Group__3__Impl rule__Mission__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Mission__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3"


    // $ANTLR start "rule__Mission__Group__3__Impl"
    // InternalMyDsl.g:1435:1: rule__Mission__Group__3__Impl : ( '{' ) ;
    public final void rule__Mission__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1439:1: ( ( '{' ) )
            // InternalMyDsl.g:1440:1: ( '{' )
            {
            // InternalMyDsl.g:1440:1: ( '{' )
            // InternalMyDsl.g:1441:2: '{'
            {
             before(grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__3__Impl"


    // $ANTLR start "rule__Mission__Group__4"
    // InternalMyDsl.g:1450:1: rule__Mission__Group__4 : rule__Mission__Group__4__Impl rule__Mission__Group__5 ;
    public final void rule__Mission__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1454:1: ( rule__Mission__Group__4__Impl rule__Mission__Group__5 )
            // InternalMyDsl.g:1455:2: rule__Mission__Group__4__Impl rule__Mission__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__Mission__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4"


    // $ANTLR start "rule__Mission__Group__4__Impl"
    // InternalMyDsl.g:1462:1: rule__Mission__Group__4__Impl : ( 'behaviors' ) ;
    public final void rule__Mission__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1466:1: ( ( 'behaviors' ) )
            // InternalMyDsl.g:1467:1: ( 'behaviors' )
            {
            // InternalMyDsl.g:1467:1: ( 'behaviors' )
            // InternalMyDsl.g:1468:2: 'behaviors'
            {
             before(grammarAccess.getMissionAccess().getBehaviorsKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getBehaviorsKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__4__Impl"


    // $ANTLR start "rule__Mission__Group__5"
    // InternalMyDsl.g:1477:1: rule__Mission__Group__5 : rule__Mission__Group__5__Impl rule__Mission__Group__6 ;
    public final void rule__Mission__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1481:1: ( rule__Mission__Group__5__Impl rule__Mission__Group__6 )
            // InternalMyDsl.g:1482:2: rule__Mission__Group__5__Impl rule__Mission__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__Mission__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__5"


    // $ANTLR start "rule__Mission__Group__5__Impl"
    // InternalMyDsl.g:1489:1: rule__Mission__Group__5__Impl : ( ':' ) ;
    public final void rule__Mission__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1493:1: ( ( ':' ) )
            // InternalMyDsl.g:1494:1: ( ':' )
            {
            // InternalMyDsl.g:1494:1: ( ':' )
            // InternalMyDsl.g:1495:2: ':'
            {
             before(grammarAccess.getMissionAccess().getColonKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getColonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__5__Impl"


    // $ANTLR start "rule__Mission__Group__6"
    // InternalMyDsl.g:1504:1: rule__Mission__Group__6 : rule__Mission__Group__6__Impl rule__Mission__Group__7 ;
    public final void rule__Mission__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1508:1: ( rule__Mission__Group__6__Impl rule__Mission__Group__7 )
            // InternalMyDsl.g:1509:2: rule__Mission__Group__6__Impl rule__Mission__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Mission__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__6"


    // $ANTLR start "rule__Mission__Group__6__Impl"
    // InternalMyDsl.g:1516:1: rule__Mission__Group__6__Impl : ( ( rule__Mission__BehaviorsAssignment_6 ) ) ;
    public final void rule__Mission__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1520:1: ( ( ( rule__Mission__BehaviorsAssignment_6 ) ) )
            // InternalMyDsl.g:1521:1: ( ( rule__Mission__BehaviorsAssignment_6 ) )
            {
            // InternalMyDsl.g:1521:1: ( ( rule__Mission__BehaviorsAssignment_6 ) )
            // InternalMyDsl.g:1522:2: ( rule__Mission__BehaviorsAssignment_6 )
            {
             before(grammarAccess.getMissionAccess().getBehaviorsAssignment_6()); 
            // InternalMyDsl.g:1523:2: ( rule__Mission__BehaviorsAssignment_6 )
            // InternalMyDsl.g:1523:3: rule__Mission__BehaviorsAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Mission__BehaviorsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getBehaviorsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__6__Impl"


    // $ANTLR start "rule__Mission__Group__7"
    // InternalMyDsl.g:1531:1: rule__Mission__Group__7 : rule__Mission__Group__7__Impl rule__Mission__Group__8 ;
    public final void rule__Mission__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1535:1: ( rule__Mission__Group__7__Impl rule__Mission__Group__8 )
            // InternalMyDsl.g:1536:2: rule__Mission__Group__7__Impl rule__Mission__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Mission__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__7"


    // $ANTLR start "rule__Mission__Group__7__Impl"
    // InternalMyDsl.g:1543:1: rule__Mission__Group__7__Impl : ( ( rule__Mission__Group_7__0 )* ) ;
    public final void rule__Mission__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1547:1: ( ( ( rule__Mission__Group_7__0 )* ) )
            // InternalMyDsl.g:1548:1: ( ( rule__Mission__Group_7__0 )* )
            {
            // InternalMyDsl.g:1548:1: ( ( rule__Mission__Group_7__0 )* )
            // InternalMyDsl.g:1549:2: ( rule__Mission__Group_7__0 )*
            {
             before(grammarAccess.getMissionAccess().getGroup_7()); 
            // InternalMyDsl.g:1550:2: ( rule__Mission__Group_7__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1550:3: rule__Mission__Group_7__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Mission__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMissionAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__7__Impl"


    // $ANTLR start "rule__Mission__Group__8"
    // InternalMyDsl.g:1558:1: rule__Mission__Group__8 : rule__Mission__Group__8__Impl ;
    public final void rule__Mission__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1562:1: ( rule__Mission__Group__8__Impl )
            // InternalMyDsl.g:1563:2: rule__Mission__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__8"


    // $ANTLR start "rule__Mission__Group__8__Impl"
    // InternalMyDsl.g:1569:1: rule__Mission__Group__8__Impl : ( '}' ) ;
    public final void rule__Mission__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1573:1: ( ( '}' ) )
            // InternalMyDsl.g:1574:1: ( '}' )
            {
            // InternalMyDsl.g:1574:1: ( '}' )
            // InternalMyDsl.g:1575:2: '}'
            {
             before(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group__8__Impl"


    // $ANTLR start "rule__Mission__Group_7__0"
    // InternalMyDsl.g:1585:1: rule__Mission__Group_7__0 : rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1 ;
    public final void rule__Mission__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1589:1: ( rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1 )
            // InternalMyDsl.g:1590:2: rule__Mission__Group_7__0__Impl rule__Mission__Group_7__1
            {
            pushFollow(FOLLOW_17);
            rule__Mission__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mission__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_7__0"


    // $ANTLR start "rule__Mission__Group_7__0__Impl"
    // InternalMyDsl.g:1597:1: rule__Mission__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Mission__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1601:1: ( ( ',' ) )
            // InternalMyDsl.g:1602:1: ( ',' )
            {
            // InternalMyDsl.g:1602:1: ( ',' )
            // InternalMyDsl.g:1603:2: ','
            {
             before(grammarAccess.getMissionAccess().getCommaKeyword_7_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_7__0__Impl"


    // $ANTLR start "rule__Mission__Group_7__1"
    // InternalMyDsl.g:1612:1: rule__Mission__Group_7__1 : rule__Mission__Group_7__1__Impl ;
    public final void rule__Mission__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1616:1: ( rule__Mission__Group_7__1__Impl )
            // InternalMyDsl.g:1617:2: rule__Mission__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mission__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_7__1"


    // $ANTLR start "rule__Mission__Group_7__1__Impl"
    // InternalMyDsl.g:1623:1: rule__Mission__Group_7__1__Impl : ( ( rule__Mission__BehaviorsAssignment_7_1 ) ) ;
    public final void rule__Mission__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1627:1: ( ( ( rule__Mission__BehaviorsAssignment_7_1 ) ) )
            // InternalMyDsl.g:1628:1: ( ( rule__Mission__BehaviorsAssignment_7_1 ) )
            {
            // InternalMyDsl.g:1628:1: ( ( rule__Mission__BehaviorsAssignment_7_1 ) )
            // InternalMyDsl.g:1629:2: ( rule__Mission__BehaviorsAssignment_7_1 )
            {
             before(grammarAccess.getMissionAccess().getBehaviorsAssignment_7_1()); 
            // InternalMyDsl.g:1630:2: ( rule__Mission__BehaviorsAssignment_7_1 )
            // InternalMyDsl.g:1630:3: rule__Mission__BehaviorsAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Mission__BehaviorsAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getMissionAccess().getBehaviorsAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__Group_7__1__Impl"


    // $ANTLR start "rule__LeftMotor__Group__0"
    // InternalMyDsl.g:1639:1: rule__LeftMotor__Group__0 : rule__LeftMotor__Group__0__Impl rule__LeftMotor__Group__1 ;
    public final void rule__LeftMotor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1643:1: ( rule__LeftMotor__Group__0__Impl rule__LeftMotor__Group__1 )
            // InternalMyDsl.g:1644:2: rule__LeftMotor__Group__0__Impl rule__LeftMotor__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__LeftMotor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftMotor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMotor__Group__0"


    // $ANTLR start "rule__LeftMotor__Group__0__Impl"
    // InternalMyDsl.g:1651:1: rule__LeftMotor__Group__0__Impl : ( () ) ;
    public final void rule__LeftMotor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1655:1: ( ( () ) )
            // InternalMyDsl.g:1656:1: ( () )
            {
            // InternalMyDsl.g:1656:1: ( () )
            // InternalMyDsl.g:1657:2: ()
            {
             before(grammarAccess.getLeftMotorAccess().getLeftMotorAction_0()); 
            // InternalMyDsl.g:1658:2: ()
            // InternalMyDsl.g:1658:3: 
            {
            }

             after(grammarAccess.getLeftMotorAccess().getLeftMotorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMotor__Group__0__Impl"


    // $ANTLR start "rule__LeftMotor__Group__1"
    // InternalMyDsl.g:1666:1: rule__LeftMotor__Group__1 : rule__LeftMotor__Group__1__Impl rule__LeftMotor__Group__2 ;
    public final void rule__LeftMotor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1670:1: ( rule__LeftMotor__Group__1__Impl rule__LeftMotor__Group__2 )
            // InternalMyDsl.g:1671:2: rule__LeftMotor__Group__1__Impl rule__LeftMotor__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__LeftMotor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftMotor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMotor__Group__1"


    // $ANTLR start "rule__LeftMotor__Group__1__Impl"
    // InternalMyDsl.g:1678:1: rule__LeftMotor__Group__1__Impl : ( 'LeftMotor' ) ;
    public final void rule__LeftMotor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1682:1: ( ( 'LeftMotor' ) )
            // InternalMyDsl.g:1683:1: ( 'LeftMotor' )
            {
            // InternalMyDsl.g:1683:1: ( 'LeftMotor' )
            // InternalMyDsl.g:1684:2: 'LeftMotor'
            {
             before(grammarAccess.getLeftMotorAccess().getLeftMotorKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLeftMotorAccess().getLeftMotorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMotor__Group__1__Impl"


    // $ANTLR start "rule__LeftMotor__Group__2"
    // InternalMyDsl.g:1693:1: rule__LeftMotor__Group__2 : rule__LeftMotor__Group__2__Impl ;
    public final void rule__LeftMotor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1697:1: ( rule__LeftMotor__Group__2__Impl )
            // InternalMyDsl.g:1698:2: rule__LeftMotor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeftMotor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMotor__Group__2"


    // $ANTLR start "rule__LeftMotor__Group__2__Impl"
    // InternalMyDsl.g:1704:1: rule__LeftMotor__Group__2__Impl : ( ( rule__LeftMotor__NameAssignment_2 ) ) ;
    public final void rule__LeftMotor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1708:1: ( ( ( rule__LeftMotor__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1709:1: ( ( rule__LeftMotor__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1709:1: ( ( rule__LeftMotor__NameAssignment_2 ) )
            // InternalMyDsl.g:1710:2: ( rule__LeftMotor__NameAssignment_2 )
            {
             before(grammarAccess.getLeftMotorAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1711:2: ( rule__LeftMotor__NameAssignment_2 )
            // InternalMyDsl.g:1711:3: rule__LeftMotor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LeftMotor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLeftMotorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMotor__Group__2__Impl"


    // $ANTLR start "rule__RightMotor__Group__0"
    // InternalMyDsl.g:1720:1: rule__RightMotor__Group__0 : rule__RightMotor__Group__0__Impl rule__RightMotor__Group__1 ;
    public final void rule__RightMotor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1724:1: ( rule__RightMotor__Group__0__Impl rule__RightMotor__Group__1 )
            // InternalMyDsl.g:1725:2: rule__RightMotor__Group__0__Impl rule__RightMotor__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__RightMotor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightMotor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMotor__Group__0"


    // $ANTLR start "rule__RightMotor__Group__0__Impl"
    // InternalMyDsl.g:1732:1: rule__RightMotor__Group__0__Impl : ( () ) ;
    public final void rule__RightMotor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1736:1: ( ( () ) )
            // InternalMyDsl.g:1737:1: ( () )
            {
            // InternalMyDsl.g:1737:1: ( () )
            // InternalMyDsl.g:1738:2: ()
            {
             before(grammarAccess.getRightMotorAccess().getRightMotorAction_0()); 
            // InternalMyDsl.g:1739:2: ()
            // InternalMyDsl.g:1739:3: 
            {
            }

             after(grammarAccess.getRightMotorAccess().getRightMotorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMotor__Group__0__Impl"


    // $ANTLR start "rule__RightMotor__Group__1"
    // InternalMyDsl.g:1747:1: rule__RightMotor__Group__1 : rule__RightMotor__Group__1__Impl rule__RightMotor__Group__2 ;
    public final void rule__RightMotor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1751:1: ( rule__RightMotor__Group__1__Impl rule__RightMotor__Group__2 )
            // InternalMyDsl.g:1752:2: rule__RightMotor__Group__1__Impl rule__RightMotor__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__RightMotor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RightMotor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMotor__Group__1"


    // $ANTLR start "rule__RightMotor__Group__1__Impl"
    // InternalMyDsl.g:1759:1: rule__RightMotor__Group__1__Impl : ( 'RightMotor' ) ;
    public final void rule__RightMotor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1763:1: ( ( 'RightMotor' ) )
            // InternalMyDsl.g:1764:1: ( 'RightMotor' )
            {
            // InternalMyDsl.g:1764:1: ( 'RightMotor' )
            // InternalMyDsl.g:1765:2: 'RightMotor'
            {
             before(grammarAccess.getRightMotorAccess().getRightMotorKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRightMotorAccess().getRightMotorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMotor__Group__1__Impl"


    // $ANTLR start "rule__RightMotor__Group__2"
    // InternalMyDsl.g:1774:1: rule__RightMotor__Group__2 : rule__RightMotor__Group__2__Impl ;
    public final void rule__RightMotor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1778:1: ( rule__RightMotor__Group__2__Impl )
            // InternalMyDsl.g:1779:2: rule__RightMotor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RightMotor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMotor__Group__2"


    // $ANTLR start "rule__RightMotor__Group__2__Impl"
    // InternalMyDsl.g:1785:1: rule__RightMotor__Group__2__Impl : ( ( rule__RightMotor__NameAssignment_2 ) ) ;
    public final void rule__RightMotor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1789:1: ( ( ( rule__RightMotor__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1790:1: ( ( rule__RightMotor__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1790:1: ( ( rule__RightMotor__NameAssignment_2 ) )
            // InternalMyDsl.g:1791:2: ( rule__RightMotor__NameAssignment_2 )
            {
             before(grammarAccess.getRightMotorAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1792:2: ( rule__RightMotor__NameAssignment_2 )
            // InternalMyDsl.g:1792:3: rule__RightMotor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RightMotor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRightMotorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMotor__Group__2__Impl"


    // $ANTLR start "rule__Escape__Group__0"
    // InternalMyDsl.g:1801:1: rule__Escape__Group__0 : rule__Escape__Group__0__Impl rule__Escape__Group__1 ;
    public final void rule__Escape__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1805:1: ( rule__Escape__Group__0__Impl rule__Escape__Group__1 )
            // InternalMyDsl.g:1806:2: rule__Escape__Group__0__Impl rule__Escape__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Escape__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escape__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group__0"


    // $ANTLR start "rule__Escape__Group__0__Impl"
    // InternalMyDsl.g:1813:1: rule__Escape__Group__0__Impl : ( () ) ;
    public final void rule__Escape__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1817:1: ( ( () ) )
            // InternalMyDsl.g:1818:1: ( () )
            {
            // InternalMyDsl.g:1818:1: ( () )
            // InternalMyDsl.g:1819:2: ()
            {
             before(grammarAccess.getEscapeAccess().getEscapeAction_0()); 
            // InternalMyDsl.g:1820:2: ()
            // InternalMyDsl.g:1820:3: 
            {
            }

             after(grammarAccess.getEscapeAccess().getEscapeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group__0__Impl"


    // $ANTLR start "rule__Escape__Group__1"
    // InternalMyDsl.g:1828:1: rule__Escape__Group__1 : rule__Escape__Group__1__Impl rule__Escape__Group__2 ;
    public final void rule__Escape__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1832:1: ( rule__Escape__Group__1__Impl rule__Escape__Group__2 )
            // InternalMyDsl.g:1833:2: rule__Escape__Group__1__Impl rule__Escape__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Escape__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escape__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group__1"


    // $ANTLR start "rule__Escape__Group__1__Impl"
    // InternalMyDsl.g:1840:1: rule__Escape__Group__1__Impl : ( 'Escape' ) ;
    public final void rule__Escape__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1844:1: ( ( 'Escape' ) )
            // InternalMyDsl.g:1845:1: ( 'Escape' )
            {
            // InternalMyDsl.g:1845:1: ( 'Escape' )
            // InternalMyDsl.g:1846:2: 'Escape'
            {
             before(grammarAccess.getEscapeAccess().getEscapeKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEscapeAccess().getEscapeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group__1__Impl"


    // $ANTLR start "rule__Escape__Group__2"
    // InternalMyDsl.g:1855:1: rule__Escape__Group__2 : rule__Escape__Group__2__Impl rule__Escape__Group__3 ;
    public final void rule__Escape__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1859:1: ( rule__Escape__Group__2__Impl rule__Escape__Group__3 )
            // InternalMyDsl.g:1860:2: rule__Escape__Group__2__Impl rule__Escape__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Escape__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escape__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group__2"


    // $ANTLR start "rule__Escape__Group__2__Impl"
    // InternalMyDsl.g:1867:1: rule__Escape__Group__2__Impl : ( '{' ) ;
    public final void rule__Escape__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1871:1: ( ( '{' ) )
            // InternalMyDsl.g:1872:1: ( '{' )
            {
            // InternalMyDsl.g:1872:1: ( '{' )
            // InternalMyDsl.g:1873:2: '{'
            {
             before(grammarAccess.getEscapeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEscapeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group__2__Impl"


    // $ANTLR start "rule__Escape__Group__3"
    // InternalMyDsl.g:1882:1: rule__Escape__Group__3 : rule__Escape__Group__3__Impl rule__Escape__Group__4 ;
    public final void rule__Escape__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1886:1: ( rule__Escape__Group__3__Impl rule__Escape__Group__4 )
            // InternalMyDsl.g:1887:2: rule__Escape__Group__3__Impl rule__Escape__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Escape__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escape__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group__3"


    // $ANTLR start "rule__Escape__Group__3__Impl"
    // InternalMyDsl.g:1894:1: rule__Escape__Group__3__Impl : ( ( rule__Escape__Group_3__0 )? ) ;
    public final void rule__Escape__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1898:1: ( ( ( rule__Escape__Group_3__0 )? ) )
            // InternalMyDsl.g:1899:1: ( ( rule__Escape__Group_3__0 )? )
            {
            // InternalMyDsl.g:1899:1: ( ( rule__Escape__Group_3__0 )? )
            // InternalMyDsl.g:1900:2: ( rule__Escape__Group_3__0 )?
            {
             before(grammarAccess.getEscapeAccess().getGroup_3()); 
            // InternalMyDsl.g:1901:2: ( rule__Escape__Group_3__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1901:3: rule__Escape__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Escape__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEscapeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group__3__Impl"


    // $ANTLR start "rule__Escape__Group__4"
    // InternalMyDsl.g:1909:1: rule__Escape__Group__4 : rule__Escape__Group__4__Impl ;
    public final void rule__Escape__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1913:1: ( rule__Escape__Group__4__Impl )
            // InternalMyDsl.g:1914:2: rule__Escape__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Escape__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group__4"


    // $ANTLR start "rule__Escape__Group__4__Impl"
    // InternalMyDsl.g:1920:1: rule__Escape__Group__4__Impl : ( '}' ) ;
    public final void rule__Escape__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1924:1: ( ( '}' ) )
            // InternalMyDsl.g:1925:1: ( '}' )
            {
            // InternalMyDsl.g:1925:1: ( '}' )
            // InternalMyDsl.g:1926:2: '}'
            {
             before(grammarAccess.getEscapeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getEscapeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group__4__Impl"


    // $ANTLR start "rule__Escape__Group_3__0"
    // InternalMyDsl.g:1936:1: rule__Escape__Group_3__0 : rule__Escape__Group_3__0__Impl rule__Escape__Group_3__1 ;
    public final void rule__Escape__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1940:1: ( rule__Escape__Group_3__0__Impl rule__Escape__Group_3__1 )
            // InternalMyDsl.g:1941:2: rule__Escape__Group_3__0__Impl rule__Escape__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Escape__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escape__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group_3__0"


    // $ANTLR start "rule__Escape__Group_3__0__Impl"
    // InternalMyDsl.g:1948:1: rule__Escape__Group_3__0__Impl : ( 'sensors' ) ;
    public final void rule__Escape__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1952:1: ( ( 'sensors' ) )
            // InternalMyDsl.g:1953:1: ( 'sensors' )
            {
            // InternalMyDsl.g:1953:1: ( 'sensors' )
            // InternalMyDsl.g:1954:2: 'sensors'
            {
             before(grammarAccess.getEscapeAccess().getSensorsKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEscapeAccess().getSensorsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group_3__0__Impl"


    // $ANTLR start "rule__Escape__Group_3__1"
    // InternalMyDsl.g:1963:1: rule__Escape__Group_3__1 : rule__Escape__Group_3__1__Impl rule__Escape__Group_3__2 ;
    public final void rule__Escape__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1967:1: ( rule__Escape__Group_3__1__Impl rule__Escape__Group_3__2 )
            // InternalMyDsl.g:1968:2: rule__Escape__Group_3__1__Impl rule__Escape__Group_3__2
            {
            pushFollow(FOLLOW_22);
            rule__Escape__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escape__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group_3__1"


    // $ANTLR start "rule__Escape__Group_3__1__Impl"
    // InternalMyDsl.g:1975:1: rule__Escape__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Escape__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1979:1: ( ( ':' ) )
            // InternalMyDsl.g:1980:1: ( ':' )
            {
            // InternalMyDsl.g:1980:1: ( ':' )
            // InternalMyDsl.g:1981:2: ':'
            {
             before(grammarAccess.getEscapeAccess().getColonKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEscapeAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group_3__1__Impl"


    // $ANTLR start "rule__Escape__Group_3__2"
    // InternalMyDsl.g:1990:1: rule__Escape__Group_3__2 : rule__Escape__Group_3__2__Impl rule__Escape__Group_3__3 ;
    public final void rule__Escape__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1994:1: ( rule__Escape__Group_3__2__Impl rule__Escape__Group_3__3 )
            // InternalMyDsl.g:1995:2: rule__Escape__Group_3__2__Impl rule__Escape__Group_3__3
            {
            pushFollow(FOLLOW_14);
            rule__Escape__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escape__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group_3__2"


    // $ANTLR start "rule__Escape__Group_3__2__Impl"
    // InternalMyDsl.g:2002:1: rule__Escape__Group_3__2__Impl : ( ( rule__Escape__SensorsAssignment_3_2 ) ) ;
    public final void rule__Escape__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2006:1: ( ( ( rule__Escape__SensorsAssignment_3_2 ) ) )
            // InternalMyDsl.g:2007:1: ( ( rule__Escape__SensorsAssignment_3_2 ) )
            {
            // InternalMyDsl.g:2007:1: ( ( rule__Escape__SensorsAssignment_3_2 ) )
            // InternalMyDsl.g:2008:2: ( rule__Escape__SensorsAssignment_3_2 )
            {
             before(grammarAccess.getEscapeAccess().getSensorsAssignment_3_2()); 
            // InternalMyDsl.g:2009:2: ( rule__Escape__SensorsAssignment_3_2 )
            // InternalMyDsl.g:2009:3: rule__Escape__SensorsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Escape__SensorsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getEscapeAccess().getSensorsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group_3__2__Impl"


    // $ANTLR start "rule__Escape__Group_3__3"
    // InternalMyDsl.g:2017:1: rule__Escape__Group_3__3 : rule__Escape__Group_3__3__Impl ;
    public final void rule__Escape__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2021:1: ( rule__Escape__Group_3__3__Impl )
            // InternalMyDsl.g:2022:2: rule__Escape__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Escape__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group_3__3"


    // $ANTLR start "rule__Escape__Group_3__3__Impl"
    // InternalMyDsl.g:2028:1: rule__Escape__Group_3__3__Impl : ( ( rule__Escape__Group_3_3__0 )* ) ;
    public final void rule__Escape__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2032:1: ( ( ( rule__Escape__Group_3_3__0 )* ) )
            // InternalMyDsl.g:2033:1: ( ( rule__Escape__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:2033:1: ( ( rule__Escape__Group_3_3__0 )* )
            // InternalMyDsl.g:2034:2: ( rule__Escape__Group_3_3__0 )*
            {
             before(grammarAccess.getEscapeAccess().getGroup_3_3()); 
            // InternalMyDsl.g:2035:2: ( rule__Escape__Group_3_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2035:3: rule__Escape__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Escape__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getEscapeAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group_3__3__Impl"


    // $ANTLR start "rule__Escape__Group_3_3__0"
    // InternalMyDsl.g:2044:1: rule__Escape__Group_3_3__0 : rule__Escape__Group_3_3__0__Impl rule__Escape__Group_3_3__1 ;
    public final void rule__Escape__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2048:1: ( rule__Escape__Group_3_3__0__Impl rule__Escape__Group_3_3__1 )
            // InternalMyDsl.g:2049:2: rule__Escape__Group_3_3__0__Impl rule__Escape__Group_3_3__1
            {
            pushFollow(FOLLOW_22);
            rule__Escape__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Escape__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group_3_3__0"


    // $ANTLR start "rule__Escape__Group_3_3__0__Impl"
    // InternalMyDsl.g:2056:1: rule__Escape__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Escape__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2060:1: ( ( ',' ) )
            // InternalMyDsl.g:2061:1: ( ',' )
            {
            // InternalMyDsl.g:2061:1: ( ',' )
            // InternalMyDsl.g:2062:2: ','
            {
             before(grammarAccess.getEscapeAccess().getCommaKeyword_3_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getEscapeAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group_3_3__0__Impl"


    // $ANTLR start "rule__Escape__Group_3_3__1"
    // InternalMyDsl.g:2071:1: rule__Escape__Group_3_3__1 : rule__Escape__Group_3_3__1__Impl ;
    public final void rule__Escape__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2075:1: ( rule__Escape__Group_3_3__1__Impl )
            // InternalMyDsl.g:2076:2: rule__Escape__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Escape__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group_3_3__1"


    // $ANTLR start "rule__Escape__Group_3_3__1__Impl"
    // InternalMyDsl.g:2082:1: rule__Escape__Group_3_3__1__Impl : ( ( rule__Escape__SensorsAssignment_3_3_1 ) ) ;
    public final void rule__Escape__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2086:1: ( ( ( rule__Escape__SensorsAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:2087:1: ( ( rule__Escape__SensorsAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:2087:1: ( ( rule__Escape__SensorsAssignment_3_3_1 ) )
            // InternalMyDsl.g:2088:2: ( rule__Escape__SensorsAssignment_3_3_1 )
            {
             before(grammarAccess.getEscapeAccess().getSensorsAssignment_3_3_1()); 
            // InternalMyDsl.g:2089:2: ( rule__Escape__SensorsAssignment_3_3_1 )
            // InternalMyDsl.g:2089:3: rule__Escape__SensorsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Escape__SensorsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEscapeAccess().getSensorsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__Group_3_3__1__Impl"


    // $ANTLR start "rule__Home__Group__0"
    // InternalMyDsl.g:2098:1: rule__Home__Group__0 : rule__Home__Group__0__Impl rule__Home__Group__1 ;
    public final void rule__Home__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2102:1: ( rule__Home__Group__0__Impl rule__Home__Group__1 )
            // InternalMyDsl.g:2103:2: rule__Home__Group__0__Impl rule__Home__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Home__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__0"


    // $ANTLR start "rule__Home__Group__0__Impl"
    // InternalMyDsl.g:2110:1: rule__Home__Group__0__Impl : ( () ) ;
    public final void rule__Home__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2114:1: ( ( () ) )
            // InternalMyDsl.g:2115:1: ( () )
            {
            // InternalMyDsl.g:2115:1: ( () )
            // InternalMyDsl.g:2116:2: ()
            {
             before(grammarAccess.getHomeAccess().getHomeAction_0()); 
            // InternalMyDsl.g:2117:2: ()
            // InternalMyDsl.g:2117:3: 
            {
            }

             after(grammarAccess.getHomeAccess().getHomeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__0__Impl"


    // $ANTLR start "rule__Home__Group__1"
    // InternalMyDsl.g:2125:1: rule__Home__Group__1 : rule__Home__Group__1__Impl rule__Home__Group__2 ;
    public final void rule__Home__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2129:1: ( rule__Home__Group__1__Impl rule__Home__Group__2 )
            // InternalMyDsl.g:2130:2: rule__Home__Group__1__Impl rule__Home__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Home__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__1"


    // $ANTLR start "rule__Home__Group__1__Impl"
    // InternalMyDsl.g:2137:1: rule__Home__Group__1__Impl : ( 'Home' ) ;
    public final void rule__Home__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2141:1: ( ( 'Home' ) )
            // InternalMyDsl.g:2142:1: ( 'Home' )
            {
            // InternalMyDsl.g:2142:1: ( 'Home' )
            // InternalMyDsl.g:2143:2: 'Home'
            {
             before(grammarAccess.getHomeAccess().getHomeKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getHomeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__1__Impl"


    // $ANTLR start "rule__Home__Group__2"
    // InternalMyDsl.g:2152:1: rule__Home__Group__2 : rule__Home__Group__2__Impl rule__Home__Group__3 ;
    public final void rule__Home__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2156:1: ( rule__Home__Group__2__Impl rule__Home__Group__3 )
            // InternalMyDsl.g:2157:2: rule__Home__Group__2__Impl rule__Home__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__Home__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__2"


    // $ANTLR start "rule__Home__Group__2__Impl"
    // InternalMyDsl.g:2164:1: rule__Home__Group__2__Impl : ( '{' ) ;
    public final void rule__Home__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2168:1: ( ( '{' ) )
            // InternalMyDsl.g:2169:1: ( '{' )
            {
            // InternalMyDsl.g:2169:1: ( '{' )
            // InternalMyDsl.g:2170:2: '{'
            {
             before(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__2__Impl"


    // $ANTLR start "rule__Home__Group__3"
    // InternalMyDsl.g:2179:1: rule__Home__Group__3 : rule__Home__Group__3__Impl rule__Home__Group__4 ;
    public final void rule__Home__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2183:1: ( rule__Home__Group__3__Impl rule__Home__Group__4 )
            // InternalMyDsl.g:2184:2: rule__Home__Group__3__Impl rule__Home__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__Home__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__3"


    // $ANTLR start "rule__Home__Group__3__Impl"
    // InternalMyDsl.g:2191:1: rule__Home__Group__3__Impl : ( ( rule__Home__Group_3__0 )? ) ;
    public final void rule__Home__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2195:1: ( ( ( rule__Home__Group_3__0 )? ) )
            // InternalMyDsl.g:2196:1: ( ( rule__Home__Group_3__0 )? )
            {
            // InternalMyDsl.g:2196:1: ( ( rule__Home__Group_3__0 )? )
            // InternalMyDsl.g:2197:2: ( rule__Home__Group_3__0 )?
            {
             before(grammarAccess.getHomeAccess().getGroup_3()); 
            // InternalMyDsl.g:2198:2: ( rule__Home__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:2198:3: rule__Home__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Home__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getHomeAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__3__Impl"


    // $ANTLR start "rule__Home__Group__4"
    // InternalMyDsl.g:2206:1: rule__Home__Group__4 : rule__Home__Group__4__Impl ;
    public final void rule__Home__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2210:1: ( rule__Home__Group__4__Impl )
            // InternalMyDsl.g:2211:2: rule__Home__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__4"


    // $ANTLR start "rule__Home__Group__4__Impl"
    // InternalMyDsl.g:2217:1: rule__Home__Group__4__Impl : ( '}' ) ;
    public final void rule__Home__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2221:1: ( ( '}' ) )
            // InternalMyDsl.g:2222:1: ( '}' )
            {
            // InternalMyDsl.g:2222:1: ( '}' )
            // InternalMyDsl.g:2223:2: '}'
            {
             before(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group__4__Impl"


    // $ANTLR start "rule__Home__Group_3__0"
    // InternalMyDsl.g:2233:1: rule__Home__Group_3__0 : rule__Home__Group_3__0__Impl rule__Home__Group_3__1 ;
    public final void rule__Home__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2237:1: ( rule__Home__Group_3__0__Impl rule__Home__Group_3__1 )
            // InternalMyDsl.g:2238:2: rule__Home__Group_3__0__Impl rule__Home__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Home__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__0"


    // $ANTLR start "rule__Home__Group_3__0__Impl"
    // InternalMyDsl.g:2245:1: rule__Home__Group_3__0__Impl : ( 'sensors' ) ;
    public final void rule__Home__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2249:1: ( ( 'sensors' ) )
            // InternalMyDsl.g:2250:1: ( 'sensors' )
            {
            // InternalMyDsl.g:2250:1: ( 'sensors' )
            // InternalMyDsl.g:2251:2: 'sensors'
            {
             before(grammarAccess.getHomeAccess().getSensorsKeyword_3_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getSensorsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__0__Impl"


    // $ANTLR start "rule__Home__Group_3__1"
    // InternalMyDsl.g:2260:1: rule__Home__Group_3__1 : rule__Home__Group_3__1__Impl rule__Home__Group_3__2 ;
    public final void rule__Home__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2264:1: ( rule__Home__Group_3__1__Impl rule__Home__Group_3__2 )
            // InternalMyDsl.g:2265:2: rule__Home__Group_3__1__Impl rule__Home__Group_3__2
            {
            pushFollow(FOLLOW_22);
            rule__Home__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__1"


    // $ANTLR start "rule__Home__Group_3__1__Impl"
    // InternalMyDsl.g:2272:1: rule__Home__Group_3__1__Impl : ( ':' ) ;
    public final void rule__Home__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2276:1: ( ( ':' ) )
            // InternalMyDsl.g:2277:1: ( ':' )
            {
            // InternalMyDsl.g:2277:1: ( ':' )
            // InternalMyDsl.g:2278:2: ':'
            {
             before(grammarAccess.getHomeAccess().getColonKeyword_3_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getColonKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__1__Impl"


    // $ANTLR start "rule__Home__Group_3__2"
    // InternalMyDsl.g:2287:1: rule__Home__Group_3__2 : rule__Home__Group_3__2__Impl rule__Home__Group_3__3 ;
    public final void rule__Home__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2291:1: ( rule__Home__Group_3__2__Impl rule__Home__Group_3__3 )
            // InternalMyDsl.g:2292:2: rule__Home__Group_3__2__Impl rule__Home__Group_3__3
            {
            pushFollow(FOLLOW_14);
            rule__Home__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__2"


    // $ANTLR start "rule__Home__Group_3__2__Impl"
    // InternalMyDsl.g:2299:1: rule__Home__Group_3__2__Impl : ( ( rule__Home__SensorsAssignment_3_2 ) ) ;
    public final void rule__Home__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2303:1: ( ( ( rule__Home__SensorsAssignment_3_2 ) ) )
            // InternalMyDsl.g:2304:1: ( ( rule__Home__SensorsAssignment_3_2 ) )
            {
            // InternalMyDsl.g:2304:1: ( ( rule__Home__SensorsAssignment_3_2 ) )
            // InternalMyDsl.g:2305:2: ( rule__Home__SensorsAssignment_3_2 )
            {
             before(grammarAccess.getHomeAccess().getSensorsAssignment_3_2()); 
            // InternalMyDsl.g:2306:2: ( rule__Home__SensorsAssignment_3_2 )
            // InternalMyDsl.g:2306:3: rule__Home__SensorsAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Home__SensorsAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getSensorsAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__2__Impl"


    // $ANTLR start "rule__Home__Group_3__3"
    // InternalMyDsl.g:2314:1: rule__Home__Group_3__3 : rule__Home__Group_3__3__Impl ;
    public final void rule__Home__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2318:1: ( rule__Home__Group_3__3__Impl )
            // InternalMyDsl.g:2319:2: rule__Home__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__3"


    // $ANTLR start "rule__Home__Group_3__3__Impl"
    // InternalMyDsl.g:2325:1: rule__Home__Group_3__3__Impl : ( ( rule__Home__Group_3_3__0 )* ) ;
    public final void rule__Home__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2329:1: ( ( ( rule__Home__Group_3_3__0 )* ) )
            // InternalMyDsl.g:2330:1: ( ( rule__Home__Group_3_3__0 )* )
            {
            // InternalMyDsl.g:2330:1: ( ( rule__Home__Group_3_3__0 )* )
            // InternalMyDsl.g:2331:2: ( rule__Home__Group_3_3__0 )*
            {
             before(grammarAccess.getHomeAccess().getGroup_3_3()); 
            // InternalMyDsl.g:2332:2: ( rule__Home__Group_3_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:2332:3: rule__Home__Group_3_3__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__Home__Group_3_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getHomeAccess().getGroup_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3__3__Impl"


    // $ANTLR start "rule__Home__Group_3_3__0"
    // InternalMyDsl.g:2341:1: rule__Home__Group_3_3__0 : rule__Home__Group_3_3__0__Impl rule__Home__Group_3_3__1 ;
    public final void rule__Home__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2345:1: ( rule__Home__Group_3_3__0__Impl rule__Home__Group_3_3__1 )
            // InternalMyDsl.g:2346:2: rule__Home__Group_3_3__0__Impl rule__Home__Group_3_3__1
            {
            pushFollow(FOLLOW_22);
            rule__Home__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Home__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3_3__0"


    // $ANTLR start "rule__Home__Group_3_3__0__Impl"
    // InternalMyDsl.g:2353:1: rule__Home__Group_3_3__0__Impl : ( ',' ) ;
    public final void rule__Home__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2357:1: ( ( ',' ) )
            // InternalMyDsl.g:2358:1: ( ',' )
            {
            // InternalMyDsl.g:2358:1: ( ',' )
            // InternalMyDsl.g:2359:2: ','
            {
             before(grammarAccess.getHomeAccess().getCommaKeyword_3_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getHomeAccess().getCommaKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3_3__0__Impl"


    // $ANTLR start "rule__Home__Group_3_3__1"
    // InternalMyDsl.g:2368:1: rule__Home__Group_3_3__1 : rule__Home__Group_3_3__1__Impl ;
    public final void rule__Home__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2372:1: ( rule__Home__Group_3_3__1__Impl )
            // InternalMyDsl.g:2373:2: rule__Home__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Home__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3_3__1"


    // $ANTLR start "rule__Home__Group_3_3__1__Impl"
    // InternalMyDsl.g:2379:1: rule__Home__Group_3_3__1__Impl : ( ( rule__Home__SensorsAssignment_3_3_1 ) ) ;
    public final void rule__Home__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2383:1: ( ( ( rule__Home__SensorsAssignment_3_3_1 ) ) )
            // InternalMyDsl.g:2384:1: ( ( rule__Home__SensorsAssignment_3_3_1 ) )
            {
            // InternalMyDsl.g:2384:1: ( ( rule__Home__SensorsAssignment_3_3_1 ) )
            // InternalMyDsl.g:2385:2: ( rule__Home__SensorsAssignment_3_3_1 )
            {
             before(grammarAccess.getHomeAccess().getSensorsAssignment_3_3_1()); 
            // InternalMyDsl.g:2386:2: ( rule__Home__SensorsAssignment_3_3_1 )
            // InternalMyDsl.g:2386:3: rule__Home__SensorsAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Home__SensorsAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getHomeAccess().getSensorsAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__Group_3_3__1__Impl"


    // $ANTLR start "rule__DistanceSensor__Group__0"
    // InternalMyDsl.g:2395:1: rule__DistanceSensor__Group__0 : rule__DistanceSensor__Group__0__Impl rule__DistanceSensor__Group__1 ;
    public final void rule__DistanceSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2399:1: ( rule__DistanceSensor__Group__0__Impl rule__DistanceSensor__Group__1 )
            // InternalMyDsl.g:2400:2: rule__DistanceSensor__Group__0__Impl rule__DistanceSensor__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__DistanceSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceSensor__Group__0"


    // $ANTLR start "rule__DistanceSensor__Group__0__Impl"
    // InternalMyDsl.g:2407:1: rule__DistanceSensor__Group__0__Impl : ( () ) ;
    public final void rule__DistanceSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2411:1: ( ( () ) )
            // InternalMyDsl.g:2412:1: ( () )
            {
            // InternalMyDsl.g:2412:1: ( () )
            // InternalMyDsl.g:2413:2: ()
            {
             before(grammarAccess.getDistanceSensorAccess().getDistanceSensorAction_0()); 
            // InternalMyDsl.g:2414:2: ()
            // InternalMyDsl.g:2414:3: 
            {
            }

             after(grammarAccess.getDistanceSensorAccess().getDistanceSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceSensor__Group__0__Impl"


    // $ANTLR start "rule__DistanceSensor__Group__1"
    // InternalMyDsl.g:2422:1: rule__DistanceSensor__Group__1 : rule__DistanceSensor__Group__1__Impl rule__DistanceSensor__Group__2 ;
    public final void rule__DistanceSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2426:1: ( rule__DistanceSensor__Group__1__Impl rule__DistanceSensor__Group__2 )
            // InternalMyDsl.g:2427:2: rule__DistanceSensor__Group__1__Impl rule__DistanceSensor__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__DistanceSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DistanceSensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceSensor__Group__1"


    // $ANTLR start "rule__DistanceSensor__Group__1__Impl"
    // InternalMyDsl.g:2434:1: rule__DistanceSensor__Group__1__Impl : ( 'DistanceSensor' ) ;
    public final void rule__DistanceSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2438:1: ( ( 'DistanceSensor' ) )
            // InternalMyDsl.g:2439:1: ( 'DistanceSensor' )
            {
            // InternalMyDsl.g:2439:1: ( 'DistanceSensor' )
            // InternalMyDsl.g:2440:2: 'DistanceSensor'
            {
             before(grammarAccess.getDistanceSensorAccess().getDistanceSensorKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDistanceSensorAccess().getDistanceSensorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceSensor__Group__1__Impl"


    // $ANTLR start "rule__DistanceSensor__Group__2"
    // InternalMyDsl.g:2449:1: rule__DistanceSensor__Group__2 : rule__DistanceSensor__Group__2__Impl ;
    public final void rule__DistanceSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2453:1: ( rule__DistanceSensor__Group__2__Impl )
            // InternalMyDsl.g:2454:2: rule__DistanceSensor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DistanceSensor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceSensor__Group__2"


    // $ANTLR start "rule__DistanceSensor__Group__2__Impl"
    // InternalMyDsl.g:2460:1: rule__DistanceSensor__Group__2__Impl : ( ( rule__DistanceSensor__NameAssignment_2 ) ) ;
    public final void rule__DistanceSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2464:1: ( ( ( rule__DistanceSensor__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2465:1: ( ( rule__DistanceSensor__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2465:1: ( ( rule__DistanceSensor__NameAssignment_2 ) )
            // InternalMyDsl.g:2466:2: ( rule__DistanceSensor__NameAssignment_2 )
            {
             before(grammarAccess.getDistanceSensorAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2467:2: ( rule__DistanceSensor__NameAssignment_2 )
            // InternalMyDsl.g:2467:3: rule__DistanceSensor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DistanceSensor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDistanceSensorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceSensor__Group__2__Impl"


    // $ANTLR start "rule__LightSensor__Group__0"
    // InternalMyDsl.g:2476:1: rule__LightSensor__Group__0 : rule__LightSensor__Group__0__Impl rule__LightSensor__Group__1 ;
    public final void rule__LightSensor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2480:1: ( rule__LightSensor__Group__0__Impl rule__LightSensor__Group__1 )
            // InternalMyDsl.g:2481:2: rule__LightSensor__Group__0__Impl rule__LightSensor__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__LightSensor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightSensor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightSensor__Group__0"


    // $ANTLR start "rule__LightSensor__Group__0__Impl"
    // InternalMyDsl.g:2488:1: rule__LightSensor__Group__0__Impl : ( () ) ;
    public final void rule__LightSensor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2492:1: ( ( () ) )
            // InternalMyDsl.g:2493:1: ( () )
            {
            // InternalMyDsl.g:2493:1: ( () )
            // InternalMyDsl.g:2494:2: ()
            {
             before(grammarAccess.getLightSensorAccess().getLightSensorAction_0()); 
            // InternalMyDsl.g:2495:2: ()
            // InternalMyDsl.g:2495:3: 
            {
            }

             after(grammarAccess.getLightSensorAccess().getLightSensorAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightSensor__Group__0__Impl"


    // $ANTLR start "rule__LightSensor__Group__1"
    // InternalMyDsl.g:2503:1: rule__LightSensor__Group__1 : rule__LightSensor__Group__1__Impl rule__LightSensor__Group__2 ;
    public final void rule__LightSensor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2507:1: ( rule__LightSensor__Group__1__Impl rule__LightSensor__Group__2 )
            // InternalMyDsl.g:2508:2: rule__LightSensor__Group__1__Impl rule__LightSensor__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__LightSensor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LightSensor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightSensor__Group__1"


    // $ANTLR start "rule__LightSensor__Group__1__Impl"
    // InternalMyDsl.g:2515:1: rule__LightSensor__Group__1__Impl : ( 'LightSensor' ) ;
    public final void rule__LightSensor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2519:1: ( ( 'LightSensor' ) )
            // InternalMyDsl.g:2520:1: ( 'LightSensor' )
            {
            // InternalMyDsl.g:2520:1: ( 'LightSensor' )
            // InternalMyDsl.g:2521:2: 'LightSensor'
            {
             before(grammarAccess.getLightSensorAccess().getLightSensorKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLightSensorAccess().getLightSensorKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightSensor__Group__1__Impl"


    // $ANTLR start "rule__LightSensor__Group__2"
    // InternalMyDsl.g:2530:1: rule__LightSensor__Group__2 : rule__LightSensor__Group__2__Impl ;
    public final void rule__LightSensor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2534:1: ( rule__LightSensor__Group__2__Impl )
            // InternalMyDsl.g:2535:2: rule__LightSensor__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LightSensor__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightSensor__Group__2"


    // $ANTLR start "rule__LightSensor__Group__2__Impl"
    // InternalMyDsl.g:2541:1: rule__LightSensor__Group__2__Impl : ( ( rule__LightSensor__NameAssignment_2 ) ) ;
    public final void rule__LightSensor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2545:1: ( ( ( rule__LightSensor__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2546:1: ( ( rule__LightSensor__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2546:1: ( ( rule__LightSensor__NameAssignment_2 ) )
            // InternalMyDsl.g:2547:2: ( rule__LightSensor__NameAssignment_2 )
            {
             before(grammarAccess.getLightSensorAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2548:2: ( rule__LightSensor__NameAssignment_2 )
            // InternalMyDsl.g:2548:3: rule__LightSensor__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LightSensor__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLightSensorAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightSensor__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalMyDsl.g:2557:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2561:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalMyDsl.g:2562:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalMyDsl.g:2569:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2573:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:2574:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:2574:1: ( ( '-' )? )
            // InternalMyDsl.g:2575:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:2576:2: ( '-' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:2576:3: '-'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalMyDsl.g:2584:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2588:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalMyDsl.g:2589:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalMyDsl.g:2596:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2600:1: ( ( ( RULE_INT )? ) )
            // InternalMyDsl.g:2601:1: ( ( RULE_INT )? )
            {
            // InternalMyDsl.g:2601:1: ( ( RULE_INT )? )
            // InternalMyDsl.g:2602:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalMyDsl.g:2603:2: ( RULE_INT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_INT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:2603:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalMyDsl.g:2611:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2615:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalMyDsl.g:2616:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalMyDsl.g:2623:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2627:1: ( ( '.' ) )
            // InternalMyDsl.g:2628:1: ( '.' )
            {
            // InternalMyDsl.g:2628:1: ( '.' )
            // InternalMyDsl.g:2629:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalMyDsl.g:2638:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2642:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalMyDsl.g:2643:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalMyDsl.g:2650:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2654:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2655:1: ( RULE_INT )
            {
            // InternalMyDsl.g:2655:1: ( RULE_INT )
            // InternalMyDsl.g:2656:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalMyDsl.g:2665:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2669:1: ( rule__EDouble__Group__4__Impl )
            // InternalMyDsl.g:2670:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalMyDsl.g:2676:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2680:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalMyDsl.g:2681:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalMyDsl.g:2681:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalMyDsl.g:2682:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalMyDsl.g:2683:2: ( rule__EDouble__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=11 && LA19_0<=12)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMyDsl.g:2683:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalMyDsl.g:2692:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2696:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalMyDsl.g:2697:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalMyDsl.g:2704:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2708:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalMyDsl.g:2709:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalMyDsl.g:2709:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalMyDsl.g:2710:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalMyDsl.g:2711:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalMyDsl.g:2711:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalMyDsl.g:2719:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2723:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalMyDsl.g:2724:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalMyDsl.g:2731:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2735:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:2736:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:2736:1: ( ( '-' )? )
            // InternalMyDsl.g:2737:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalMyDsl.g:2738:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==33) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMyDsl.g:2738:3: '-'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalMyDsl.g:2746:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2750:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalMyDsl.g:2751:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalMyDsl.g:2757:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2761:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2762:1: ( RULE_INT )
            {
            // InternalMyDsl.g:2762:1: ( RULE_INT )
            // InternalMyDsl.g:2763:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalMyDsl.g:2773:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2777:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalMyDsl.g:2778:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalMyDsl.g:2785:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2789:1: ( ( ( '-' )? ) )
            // InternalMyDsl.g:2790:1: ( ( '-' )? )
            {
            // InternalMyDsl.g:2790:1: ( ( '-' )? )
            // InternalMyDsl.g:2791:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalMyDsl.g:2792:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==33) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMyDsl.g:2792:3: '-'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalMyDsl.g:2800:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2804:1: ( rule__EInt__Group__1__Impl )
            // InternalMyDsl.g:2805:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalMyDsl.g:2811:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2815:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2816:1: ( RULE_INT )
            {
            // InternalMyDsl.g:2816:1: ( RULE_INT )
            // InternalMyDsl.g:2817:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__RobotConfiguration__MAX_SPEEDAssignment_2_2"
    // InternalMyDsl.g:2827:1: rule__RobotConfiguration__MAX_SPEEDAssignment_2_2 : ( ruleEDouble ) ;
    public final void rule__RobotConfiguration__MAX_SPEEDAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2831:1: ( ( ruleEDouble ) )
            // InternalMyDsl.g:2832:2: ( ruleEDouble )
            {
            // InternalMyDsl.g:2832:2: ( ruleEDouble )
            // InternalMyDsl.g:2833:3: ruleEDouble
            {
             before(grammarAccess.getRobotConfigurationAccess().getMAX_SPEEDEDoubleParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getRobotConfigurationAccess().getMAX_SPEEDEDoubleParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__MAX_SPEEDAssignment_2_2"


    // $ANTLR start "rule__RobotConfiguration__TIME_STEPAssignment_3_2"
    // InternalMyDsl.g:2842:1: rule__RobotConfiguration__TIME_STEPAssignment_3_2 : ( ruleEInt ) ;
    public final void rule__RobotConfiguration__TIME_STEPAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2846:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:2847:2: ( ruleEInt )
            {
            // InternalMyDsl.g:2847:2: ( ruleEInt )
            // InternalMyDsl.g:2848:3: ruleEInt
            {
             before(grammarAccess.getRobotConfigurationAccess().getTIME_STEPEIntParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRobotConfigurationAccess().getTIME_STEPEIntParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__TIME_STEPAssignment_3_2"


    // $ANTLR start "rule__RobotConfiguration__RobotAssignment_6"
    // InternalMyDsl.g:2857:1: rule__RobotConfiguration__RobotAssignment_6 : ( ruleRobot ) ;
    public final void rule__RobotConfiguration__RobotAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2861:1: ( ( ruleRobot ) )
            // InternalMyDsl.g:2862:2: ( ruleRobot )
            {
            // InternalMyDsl.g:2862:2: ( ruleRobot )
            // InternalMyDsl.g:2863:3: ruleRobot
            {
             before(grammarAccess.getRobotConfigurationAccess().getRobotRobotParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRobot();

            state._fsp--;

             after(grammarAccess.getRobotConfigurationAccess().getRobotRobotParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__RobotAssignment_6"


    // $ANTLR start "rule__RobotConfiguration__MissionAssignment_7_2"
    // InternalMyDsl.g:2872:1: rule__RobotConfiguration__MissionAssignment_7_2 : ( ruleMission ) ;
    public final void rule__RobotConfiguration__MissionAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2876:1: ( ( ruleMission ) )
            // InternalMyDsl.g:2877:2: ( ruleMission )
            {
            // InternalMyDsl.g:2877:2: ( ruleMission )
            // InternalMyDsl.g:2878:3: ruleMission
            {
             before(grammarAccess.getRobotConfigurationAccess().getMissionMissionParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMission();

            state._fsp--;

             after(grammarAccess.getRobotConfigurationAccess().getMissionMissionParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RobotConfiguration__MissionAssignment_7_2"


    // $ANTLR start "rule__Robot__NameAssignment_2"
    // InternalMyDsl.g:2887:1: rule__Robot__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Robot__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2891:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2892:2: ( ruleEString )
            {
            // InternalMyDsl.g:2892:2: ( ruleEString )
            // InternalMyDsl.g:2893:3: ruleEString
            {
             before(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__NameAssignment_2"


    // $ANTLR start "rule__Robot__ActuatorsAssignment_4_2"
    // InternalMyDsl.g:2902:1: rule__Robot__ActuatorsAssignment_4_2 : ( ruleActuator ) ;
    public final void rule__Robot__ActuatorsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2906:1: ( ( ruleActuator ) )
            // InternalMyDsl.g:2907:2: ( ruleActuator )
            {
            // InternalMyDsl.g:2907:2: ( ruleActuator )
            // InternalMyDsl.g:2908:3: ruleActuator
            {
             before(grammarAccess.getRobotAccess().getActuatorsActuatorParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getActuatorsActuatorParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__ActuatorsAssignment_4_2"


    // $ANTLR start "rule__Robot__ActuatorsAssignment_4_3_1"
    // InternalMyDsl.g:2917:1: rule__Robot__ActuatorsAssignment_4_3_1 : ( ruleActuator ) ;
    public final void rule__Robot__ActuatorsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2921:1: ( ( ruleActuator ) )
            // InternalMyDsl.g:2922:2: ( ruleActuator )
            {
            // InternalMyDsl.g:2922:2: ( ruleActuator )
            // InternalMyDsl.g:2923:3: ruleActuator
            {
             before(grammarAccess.getRobotAccess().getActuatorsActuatorParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActuator();

            state._fsp--;

             after(grammarAccess.getRobotAccess().getActuatorsActuatorParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Robot__ActuatorsAssignment_4_3_1"


    // $ANTLR start "rule__Mission__FinishedAssignment_0"
    // InternalMyDsl.g:2932:1: rule__Mission__FinishedAssignment_0 : ( ( 'finished' ) ) ;
    public final void rule__Mission__FinishedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2936:1: ( ( ( 'finished' ) ) )
            // InternalMyDsl.g:2937:2: ( ( 'finished' ) )
            {
            // InternalMyDsl.g:2937:2: ( ( 'finished' ) )
            // InternalMyDsl.g:2938:3: ( 'finished' )
            {
             before(grammarAccess.getMissionAccess().getFinishedFinishedKeyword_0_0()); 
            // InternalMyDsl.g:2939:3: ( 'finished' )
            // InternalMyDsl.g:2940:4: 'finished'
            {
             before(grammarAccess.getMissionAccess().getFinishedFinishedKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMissionAccess().getFinishedFinishedKeyword_0_0()); 

            }

             after(grammarAccess.getMissionAccess().getFinishedFinishedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__FinishedAssignment_0"


    // $ANTLR start "rule__Mission__NameAssignment_2"
    // InternalMyDsl.g:2951:1: rule__Mission__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Mission__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2955:1: ( ( ruleEString ) )
            // InternalMyDsl.g:2956:2: ( ruleEString )
            {
            // InternalMyDsl.g:2956:2: ( ruleEString )
            // InternalMyDsl.g:2957:3: ruleEString
            {
             before(grammarAccess.getMissionAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__NameAssignment_2"


    // $ANTLR start "rule__Mission__BehaviorsAssignment_6"
    // InternalMyDsl.g:2966:1: rule__Mission__BehaviorsAssignment_6 : ( ruleBehavior ) ;
    public final void rule__Mission__BehaviorsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2970:1: ( ( ruleBehavior ) )
            // InternalMyDsl.g:2971:2: ( ruleBehavior )
            {
            // InternalMyDsl.g:2971:2: ( ruleBehavior )
            // InternalMyDsl.g:2972:3: ruleBehavior
            {
             before(grammarAccess.getMissionAccess().getBehaviorsBehaviorParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBehavior();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getBehaviorsBehaviorParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__BehaviorsAssignment_6"


    // $ANTLR start "rule__Mission__BehaviorsAssignment_7_1"
    // InternalMyDsl.g:2981:1: rule__Mission__BehaviorsAssignment_7_1 : ( ruleBehavior ) ;
    public final void rule__Mission__BehaviorsAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2985:1: ( ( ruleBehavior ) )
            // InternalMyDsl.g:2986:2: ( ruleBehavior )
            {
            // InternalMyDsl.g:2986:2: ( ruleBehavior )
            // InternalMyDsl.g:2987:3: ruleBehavior
            {
             before(grammarAccess.getMissionAccess().getBehaviorsBehaviorParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBehavior();

            state._fsp--;

             after(grammarAccess.getMissionAccess().getBehaviorsBehaviorParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mission__BehaviorsAssignment_7_1"


    // $ANTLR start "rule__LeftMotor__NameAssignment_2"
    // InternalMyDsl.g:2996:1: rule__LeftMotor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LeftMotor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3000:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3001:2: ( ruleEString )
            {
            // InternalMyDsl.g:3001:2: ( ruleEString )
            // InternalMyDsl.g:3002:3: ruleEString
            {
             before(grammarAccess.getLeftMotorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLeftMotorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftMotor__NameAssignment_2"


    // $ANTLR start "rule__RightMotor__NameAssignment_2"
    // InternalMyDsl.g:3011:1: rule__RightMotor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RightMotor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3015:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3016:2: ( ruleEString )
            {
            // InternalMyDsl.g:3016:2: ( ruleEString )
            // InternalMyDsl.g:3017:3: ruleEString
            {
             before(grammarAccess.getRightMotorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRightMotorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RightMotor__NameAssignment_2"


    // $ANTLR start "rule__Escape__SensorsAssignment_3_2"
    // InternalMyDsl.g:3026:1: rule__Escape__SensorsAssignment_3_2 : ( ruleSensor ) ;
    public final void rule__Escape__SensorsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3030:1: ( ( ruleSensor ) )
            // InternalMyDsl.g:3031:2: ( ruleSensor )
            {
            // InternalMyDsl.g:3031:2: ( ruleSensor )
            // InternalMyDsl.g:3032:3: ruleSensor
            {
             before(grammarAccess.getEscapeAccess().getSensorsSensorParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getEscapeAccess().getSensorsSensorParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__SensorsAssignment_3_2"


    // $ANTLR start "rule__Escape__SensorsAssignment_3_3_1"
    // InternalMyDsl.g:3041:1: rule__Escape__SensorsAssignment_3_3_1 : ( ruleSensor ) ;
    public final void rule__Escape__SensorsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3045:1: ( ( ruleSensor ) )
            // InternalMyDsl.g:3046:2: ( ruleSensor )
            {
            // InternalMyDsl.g:3046:2: ( ruleSensor )
            // InternalMyDsl.g:3047:3: ruleSensor
            {
             before(grammarAccess.getEscapeAccess().getSensorsSensorParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getEscapeAccess().getSensorsSensorParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Escape__SensorsAssignment_3_3_1"


    // $ANTLR start "rule__Home__SensorsAssignment_3_2"
    // InternalMyDsl.g:3056:1: rule__Home__SensorsAssignment_3_2 : ( ruleSensor ) ;
    public final void rule__Home__SensorsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3060:1: ( ( ruleSensor ) )
            // InternalMyDsl.g:3061:2: ( ruleSensor )
            {
            // InternalMyDsl.g:3061:2: ( ruleSensor )
            // InternalMyDsl.g:3062:3: ruleSensor
            {
             before(grammarAccess.getHomeAccess().getSensorsSensorParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getSensorsSensorParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__SensorsAssignment_3_2"


    // $ANTLR start "rule__Home__SensorsAssignment_3_3_1"
    // InternalMyDsl.g:3071:1: rule__Home__SensorsAssignment_3_3_1 : ( ruleSensor ) ;
    public final void rule__Home__SensorsAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3075:1: ( ( ruleSensor ) )
            // InternalMyDsl.g:3076:2: ( ruleSensor )
            {
            // InternalMyDsl.g:3076:2: ( ruleSensor )
            // InternalMyDsl.g:3077:3: ruleSensor
            {
             before(grammarAccess.getHomeAccess().getSensorsSensorParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSensor();

            state._fsp--;

             after(grammarAccess.getHomeAccess().getSensorsSensorParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Home__SensorsAssignment_3_3_1"


    // $ANTLR start "rule__DistanceSensor__NameAssignment_2"
    // InternalMyDsl.g:3086:1: rule__DistanceSensor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DistanceSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3090:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3091:2: ( ruleEString )
            {
            // InternalMyDsl.g:3091:2: ( ruleEString )
            // InternalMyDsl.g:3092:3: ruleEString
            {
             before(grammarAccess.getDistanceSensorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDistanceSensorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DistanceSensor__NameAssignment_2"


    // $ANTLR start "rule__LightSensor__NameAssignment_2"
    // InternalMyDsl.g:3101:1: rule__LightSensor__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__LightSensor__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3105:1: ( ( ruleEString ) )
            // InternalMyDsl.g:3106:2: ( ruleEString )
            {
            // InternalMyDsl.g:3106:2: ( ruleEString )
            // InternalMyDsl.g:3107:3: ruleEString
            {
             before(grammarAccess.getLightSensorAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getLightSensorAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LightSensor__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000600000040L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000801000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000820000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000001800L});

}