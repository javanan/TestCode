package com.test;
import org.junit.Assert;
import org.junit.Test;



public class Main {
    public static String join(String... args) {
        String ret=args[0];
        for(int i=1;i<args.length;i++){
              ret=ret+"/"+args[i];
        }
    
        

    	if(ret.endsWith("/")){
    		ret=ret.substring(0, ret.length()-1);
    	}
  
         ret = ret.replaceAll("/{1,}", "/");
         return ret;
    }

    

    @Test
    public void test() {
        Assert.assertEquals(join("d").toString(), "d");
        Assert.assertEquals(join("d", "", "w").toString(), "d/w");
        Assert.assertEquals(join("d", "/", "/w").toString(), "d/w");
        Assert.assertEquals(join("d", "w").toString(), "d/w");
        Assert.assertEquals(join("d/////d///ddd///", "////w/").toString(), "d/d/ddd/w");
        Assert.assertEquals(join("/d/////d///ddd///", "////w/").toString(), "/d/d/ddd/w");
        Assert.assertEquals(join("//few//wd/////d///ddd///", "////w///dewdew/dwedw/", "fewfew/").toString(), "/few/wd/d/ddd/w/dewdew/dwedw/fewfew");
    }
}

