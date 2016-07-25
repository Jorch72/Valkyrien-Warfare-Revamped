package ValkyrienWarfareBase;

import ValkyrienWarfareBase.API.Vector;
import ValkyrienWarfareBase.Physics.BlockForce;
import ValkyrienWarfareBase.Physics.BlockMass;
import net.minecraft.init.Blocks;

public class BlockPhysicsRegistration {
	
	public static BlockMass blockMass = BlockMass.basicMass;
	public static BlockForce blockForces = BlockForce.basicForces;
	
	public static void registerVanillaBlocksMass(){
		blockMass.registerBlockMass(Blocks.AIR, 0D);
		blockMass.registerBlockMass(Blocks.FIRE, 0D);
		blockMass.registerBlockMass(Blocks.FLOWING_WATER, 0D);
		blockMass.registerBlockMass(Blocks.FLOWING_LAVA, 0D);
		blockMass.registerBlockMass(Blocks.WATER, 0D);
		blockMass.registerBlockMass(Blocks.LAVA, 0D);
		blockMass.registerBlockMass(Blocks.WOOL, 10D);
		blockMass.registerBlockMass(Blocks.PLANKS, 50D);
		blockMass.registerBlockMass(Blocks.SAND, 120D);
		blockMass.registerBlockMass(Blocks.COBBLESTONE, 180D);
		blockMass.registerBlockMass(Blocks.STONE, 180D);
		blockMass.registerBlockMass(Blocks.IRON_BLOCK, 250D);
		blockMass.registerBlockMass(Blocks.OBSIDIAN, 500D);
		blockMass.registerBlockMass(Blocks.BEDROCK, 2000D);
	}
	
	public static void registerVanillaBlockForces(){
		blockForces.registerBlockForce(Blocks.WOOL, new Vector(0,1000D,0), false);
	}
	
}
