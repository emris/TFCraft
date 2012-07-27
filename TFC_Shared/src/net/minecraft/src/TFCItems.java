package net.minecraft.src;

import java.io.File;

import TFC.Blocks.BlockTerraSluice;
import TFC.Core.AnvilReq;
import TFC.Core.IProxy;
import TFC.Core.ItemDyeCustom;
import TFC.Core.ServerClientProxy;
import TFC.Core.TFCSettings;
import TFC.Core.TFC_Core;
import TFC.Items.ItemChisel;
import TFC.Items.ItemCustomAxe;
import TFC.Items.ItemCustomBucket;
import TFC.Items.ItemCustomBucketMilk;
import TFC.Items.ItemCustomHoe;
import TFC.Items.ItemCustomKnife;
import TFC.Items.ItemCustomPaxel;
import TFC.Items.ItemCustomPickaxe;
import TFC.Items.ItemCustomSaw;
import TFC.Items.ItemCustomScythe;
import TFC.Items.ItemCustomSeeds;
import TFC.Items.ItemCustomShovel;
import TFC.Items.ItemFlatRock;
import TFC.Items.ItemFruitTreeSapling;
import TFC.Items.ItemHammer;
import TFC.Items.ItemLooseRock;
import TFC.Items.ItemPlank;
import TFC.Items.ItemStick;
import TFC.Items.ItemTerra;
import TFC.Items.ItemTerraAnvil;
import TFC.Items.ItemTerraArmor;
import TFC.Items.ItemTerraBellows;
import TFC.Items.ItemTerraFirestarter;
import TFC.Items.ItemTerraFood;
import TFC.Items.ItemTerraGem;
import TFC.Items.ItemTerraGoldPan;
import TFC.Items.ItemTerraIngot;
import TFC.Items.ItemTerraJavelin;
import TFC.Items.ItemTerraLogs;
import TFC.Items.ItemTerraMeltedMetal;
import TFC.Items.ItemTerraMiscTool;
import TFC.Items.ItemTerraMiscToolHead;
import TFC.Items.ItemTerraOreSmall;
import TFC.Items.ItemTerraProPick;
import TFC.Items.ItemTerraSluice;
import TFC.Items.ItemTerraOre;
import TFC.Items.ItemTerraSword;
import TFC.Items.ItemTerraWoodSupport;
import TFC.Items.ItemUnfinishedArmor;
import TFC.TileEntities.TileEntityTerraSluice;

import net.minecraft.src.Block;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.Item;
import net.minecraft.src.forge.Configuration;
import net.minecraft.src.forge.EnumHelper;

public class TFCItems
{
    public static Item terraWoodSupportItemH;
    public static Item terraWoodSupportItemV;

    public static Item terraGemRuby;
    public static Item terraGemSapphire;
    public static Item terraGemEmerald;
    public static Item terraGemTopaz;
    public static Item terraGemGarnet;
    public static Item terraGemOpal;
    public static Item terraGemAmethyst;
    public static Item terraGemJasper;
    public static Item terraGemBeryl;
    public static Item terraGemTourmaline;
    public static Item terraGemJade;
    public static Item terraGemAgate;
    public static Item terraGemDiamond;
    public static Item terraSulfurPowder;
    public static Item terraSaltpeterPowder;

    public static Item BismuthIngot;
    public static Item BismuthBronzeIngot;
    public static Item BlackBronzeIngot;
    public static Item BlackSteelIngot;
    public static Item HCBlackSteelIngot;
    public static Item BlueSteelIngot;
    public static Item WeakBlueSteelIngot;
    public static Item HCBlueSteelIngot;
    public static Item BrassIngot;
    public static Item BronzeIngot;
    public static Item CopperIngot;
    public static Item GoldIngot;
    public static Item WroughtIronIngot;
    public static Item LeadIngot;
    public static Item NickelIngot;
    public static Item PigIronIngot;
    public static Item PlatinumIngot;
    public static Item RedSteelIngot;
    public static Item WeakRedSteelIngot;
    public static Item HCRedSteelIngot;
    public static Item RoseGoldIngot;
    public static Item SilverIngot;
    public static Item SteelIngot;
    public static Item WeakSteelIngot;
    public static Item HCSteelIngot;
    public static Item SterlingSilverIngot;
    public static Item TinIngot;
    public static Item ZincIngot;

    public static Item BismuthIngot2x;
    public static Item BismuthBronzeIngot2x;
    public static Item BlackBronzeIngot2x;
    public static Item BlackSteelIngot2x;
    public static Item BlueSteelIngot2x;
    public static Item BrassIngot2x;
    public static Item BronzeIngot2x;
    public static Item CopperIngot2x;
    public static Item GoldIngot2x;
    public static Item WroughtIronIngot2x;
    public static Item LeadIngot2x;
    public static Item NickelIngot2x;
    public static Item PigIronIngot2x;
    public static Item PlatinumIngot2x;
    public static Item RedSteelIngot2x;
    public static Item RoseGoldIngot2x;
    public static Item SilverIngot2x;
    public static Item SteelIngot2x;
    public static Item SterlingSilverIngot2x;
    public static Item TinIngot2x;
    public static Item ZincIngot2x;

    public static Item terraIgInPick;
    public static Item terraIgInShovel;
    public static Item terraIgInAxe;
    public static Item terraIgInHoe;
    public static Item terraSedPick;
    public static Item terraSedShovel;
    public static Item terraSedAxe;
    public static Item terraSedHoe;
    public static Item terraIgExPick;
    public static Item terraIgExShovel;
    public static Item terraIgExAxe;
    public static Item terraIgExHoe;
    public static Item terraMMPick;
    public static Item terraMMShovel;
    public static Item terraMMAxe;
    public static Item terraMMHoe;

    public static Item terraBismuthPick;
    public static Item terraBismuthShovel;
    public static Item terraBismuthAxe;
    public static Item terraBismuthHoe;
    public static Item terraBismuthBronzePick;
    public static Item terraBismuthBronzeShovel;
    public static Item terraBismuthBronzeAxe;
    public static Item terraBismuthBronzeHoe;
    public static Item terraBlackBronzePick;
    public static Item terraBlackBronzeShovel;
    public static Item terraBlackBronzeAxe;
    public static Item terraBlackBronzeHoe;
    public static Item terraBlackSteelPick;
    public static Item terraBlackSteelShovel;
    public static Item terraBlackSteelAxe;
    public static Item terraBlackSteelHoe;
    public static Item terraBlueSteelPick;
    public static Item terraBlueSteelShovel;
    public static Item terraBlueSteelAxe;
    public static Item terraBlueSteelHoe;
    public static Item terraBronzePick;
    public static Item terraBronzeShovel;
    public static Item terraBronzeAxe;
    public static Item terraBronzeHoe;
    public static Item terraCopperPick;
    public static Item terraCopperShovel;
    public static Item terraCopperAxe;
    public static Item terraCopperHoe;
    public static Item terraWroughtIronPick;
    public static Item terraWroughtIronShovel;
    public static Item terraWroughtIronAxe;
    public static Item terraWroughtIronHoe;
    public static Item terraRedSteelPick;
    public static Item terraRedSteelShovel;
    public static Item terraRedSteelAxe;
    public static Item terraRedSteelHoe;
    public static Item terraRoseGoldPick;
    public static Item terraRoseGoldShovel;
    public static Item terraRoseGoldAxe;
    public static Item terraRoseGoldHoe;
    public static Item terraSteelPick;
    public static Item terraSteelShovel;
    public static Item terraSteelAxe;
    public static Item terraSteelHoe;
    public static Item terraTinPick;
    public static Item terraTinShovel;
    public static Item terraTinAxe;
    public static Item terraTinHoe;
    public static Item terraZincPick;
    public static Item terraZincShovel;
    public static Item terraZincAxe;
    public static Item terraZincHoe;

    public static Item StoneChisel;
    public static Item BismuthChisel;
    public static Item BismuthBronzeChisel;
    public static Item BlackBronzeChisel;
    public static Item BlackSteelChisel;
    public static Item BlueSteelChisel;
    public static Item BronzeChisel;
    public static Item CopperChisel;
    public static Item WroughtIronChisel;
    public static Item RedSteelChisel;
    public static Item RoseGoldChisel;
    public static Item SteelChisel;
    public static Item TinChisel;
    public static Item ZincChisel;

    public static Item IgInStoneSword;
    public static Item IgExStoneSword;
    public static Item SedStoneSword;
    public static Item MMStoneSword;
    public static Item BismuthSword;
    public static Item BismuthBronzeSword;
    public static Item BlackBronzeSword;
    public static Item BlackSteelSword;
    public static Item BlueSteelSword;
    public static Item BronzeSword;
    public static Item CopperSword;
    public static Item WroughtIronSword;
    public static Item RedSteelSword;
    public static Item RoseGoldSword;
    public static Item SteelSword;
    public static Item TinSword;
    public static Item ZincSword;

    public static Item IgInStoneMace;
    public static Item IgExStoneMace;
    public static Item SedStoneMace;
    public static Item MMStoneMace; 
    public static Item BismuthMace;
    public static Item BismuthBronzeMace;
    public static Item BlackBronzeMace;
    public static Item BlackSteelMace;
    public static Item BlueSteelMace;
    public static Item BronzeMace;
    public static Item CopperMace;
    public static Item WroughtIronMace;
    public static Item RedSteelMace;
    public static Item RoseGoldMace;
    public static Item SteelMace;
    public static Item TinMace;
    public static Item ZincMace;

    public static Item BismuthSaw;
    public static Item BismuthBronzeSaw;
    public static Item BlackBronzeSaw;
    public static Item BlackSteelSaw;
    public static Item BlueSteelSaw;
    public static Item BronzeSaw;
    public static Item CopperSaw;
    public static Item WroughtIronSaw;
    public static Item RedSteelSaw;
    public static Item RoseGoldSaw;
    public static Item SteelSaw;
    public static Item TinSaw;
    public static Item ZincSaw;

    public static Item OreChunk;
    public static Item Logs;
    public static Item FlintPaxel;
    public static Item Javelin;

    public static Item boneIgInPick;
    public static Item boneIgInShovel;
    public static Item boneIgInAxe;
    public static Item boneIgInHoe;
    public static Item boneIgExPick;
    public static Item boneIgExShovel;
    public static Item boneIgExAxe;
    public static Item boneIgExHoe;
    public static Item boneSedPick;
    public static Item boneSedShovel;
    public static Item boneSedAxe;
    public static Item boneSedHoe;
    public static Item boneMMPick;
    public static Item boneMMShovel;
    public static Item boneMMAxe;
    public static Item boneMMHoe;
    
    public static Item BismuthScythe;
    public static Item BismuthBronzeScythe;
    public static Item BlackBronzeScythe;
    public static Item BlackSteelScythe;
    public static Item BlueSteelScythe;
    public static Item BronzeScythe;
    public static Item CopperScythe;
    public static Item WroughtIronScythe;
    public static Item RedSteelScythe;
    public static Item RoseGoldScythe;
    public static Item SteelScythe;
    public static Item TinScythe;
    public static Item ZincScythe;
    
    public static Item BismuthKnife;
    public static Item BismuthBronzeKnife;
    public static Item BlackBronzeKnife;
    public static Item BlackSteelKnife;
    public static Item BlueSteelKnife;
    public static Item BronzeKnife;
    public static Item CopperKnife;
    public static Item WroughtIronKnife;
    public static Item RedSteelKnife;
    public static Item RoseGoldKnife;
    public static Item SteelKnife;
    public static Item TinKnife;
    public static Item ZincKnife;
    
    public static Item terraFireStarter;
    public static Item terraBellowsItem;
    public static Item terraStoneAnvilItem;
    public static Item terraBismuthBronzeAnvilItem;
    public static Item terraBlackBronzeAnvilItem;
    public static Item terraBlackSteelAnvilItem;
    public static Item terraBlueSteelAnvilItem;
    public static Item terraBronzeAnvilItem;
    public static Item terraCopperAnvilItem;
    public static Item terraWroughtIronAnvilItem;
    public static Item terraRedSteelAnvilItem;
    public static Item terraRoseGoldAnvilItem;
    public static Item terraSteelAnvilItem;

    public static Item StoneHammer;
    public static Item BismuthHammer;
    public static Item BismuthBronzeHammer;
    public static Item BlackBronzeHammer;
    public static Item BlackSteelHammer;
    public static Item BlueSteelHammer;
    public static Item BronzeHammer;
    public static Item CopperHammer;
    public static Item WroughtIronHammer;
    public static Item RedSteelHammer;
    public static Item RoseGoldHammer;
    public static Item SteelHammer;
    public static Item TinHammer;
    public static Item ZincHammer;

    public static Item BismuthUnshaped;
    public static Item BismuthBronzeUnshaped;
    public static Item BlackBronzeUnshaped;
    public static Item BlackSteelUnshaped;
    public static Item HCBlackSteelUnshaped;
    public static Item BlueSteelUnshaped;
    public static Item WeakBlueSteelUnshaped;
    public static Item HCBlueSteelUnshaped;
    public static Item BrassUnshaped;
    public static Item BronzeUnshaped;
    public static Item CopperUnshaped;
    public static Item GoldUnshaped;
    public static Item WroughtIronUnshaped;
    public static Item LeadUnshaped;
    public static Item NickelUnshaped;
    public static Item PigIronUnshaped;
    public static Item PlatinumUnshaped;
    public static Item RedSteelUnshaped;
    public static Item WeakRedSteelUnshaped;
    public static Item HCRedSteelUnshaped;
    public static Item RoseGoldUnshaped;
    public static Item SilverUnshaped;
    public static Item SteelUnshaped;
    public static Item WeakSteelUnshaped;
    public static Item HCSteelUnshaped;
    public static Item SterlingSilverUnshaped;
    public static Item TinUnshaped;
    public static Item ZincUnshaped;
    public static Item terraClayMold;
    public static Item terraCeramicMold;
    public static Item terraMeltedUnknown;

    public static Item terraSlag;
    public static Item terraInk;

    //Plans
    public static Item PickaxeHeadPlan;
    public static Item ShovelHeadPlan;
    public static Item HoeHeadPlan;
    public static Item AxeHeadPlan;
    public static Item HammerHeadPlan;
    public static Item ChiselHeadPlan;
    public static Item SwordBladePlan;
    public static Item MaceHeadPlan;
    public static Item SawBladePlan;
    public static Item ProPickHeadPlan;
    public static Item HelmetPlan;
    public static Item ChestplatePlan;
    public static Item GreavesPlan;
    public static Item BootsPlan;
    public static Item ScythePlan;
    public static Item KnifePlan;

    //Tool Heads
    public static Item BismuthPickaxeHead;
    public static Item BismuthBronzePickaxeHead;
    public static Item BlackBronzePickaxeHead;
    public static Item BlackSteelPickaxeHead;
    public static Item BlueSteelPickaxeHead;
    public static Item BronzePickaxeHead;
    public static Item CopperPickaxeHead;
    public static Item WroughtIronPickaxeHead;
    public static Item RedSteelPickaxeHead;
    public static Item RoseGoldPickaxeHead;
    public static Item SteelPickaxeHead;
    public static Item TinPickaxeHead;
    public static Item ZincPickaxeHead;

    public static Item BismuthShovelHead;
    public static Item BismuthBronzeShovelHead;
    public static Item BlackBronzeShovelHead;
    public static Item BlackSteelShovelHead;
    public static Item BlueSteelShovelHead;
    public static Item BronzeShovelHead;
    public static Item CopperShovelHead;
    public static Item WroughtIronShovelHead;
    public static Item RedSteelShovelHead;
    public static Item RoseGoldShovelHead;
    public static Item SilverShovelHead;
    public static Item SteelShovelHead;
    public static Item TinShovelHead;
    public static Item ZincShovelHead;

    public static Item BismuthHoeHead;
    public static Item BismuthBronzeHoeHead;
    public static Item BlackBronzeHoeHead;
    public static Item BlackSteelHoeHead;
    public static Item BlueSteelHoeHead;
    public static Item BronzeHoeHead;
    public static Item CopperHoeHead;
    public static Item WroughtIronHoeHead;
    public static Item RedSteelHoeHead;
    public static Item RoseGoldHoeHead;
    public static Item SteelHoeHead;
    public static Item TinHoeHead;
    public static Item ZincHoeHead;

    public static Item BismuthAxeHead;
    public static Item BismuthBronzeAxeHead;
    public static Item BlackBronzeAxeHead;
    public static Item BlackSteelAxeHead;
    public static Item BlueSteelAxeHead;
    public static Item BronzeAxeHead;
    public static Item CopperAxeHead;
    public static Item WroughtIronAxeHead;
    public static Item RedSteelAxeHead;
    public static Item RoseGoldAxeHead;
    public static Item SteelAxeHead;
    public static Item TinAxeHead;
    public static Item ZincAxeHead;

    public static Item BismuthHammerHead;
    public static Item BismuthBronzeHammerHead;
    public static Item BlackBronzeHammerHead;
    public static Item BlackSteelHammerHead;
    public static Item BlueSteelHammerHead;
    public static Item BronzeHammerHead;
    public static Item CopperHammerHead;
    public static Item WroughtIronHammerHead;
    public static Item RedSteelHammerHead;
    public static Item RoseGoldHammerHead;
    public static Item SteelHammerHead;
    public static Item TinHammerHead;
    public static Item ZincHammerHead;

    public static Item BismuthChiselHead;
    public static Item BismuthBronzeChiselHead;
    public static Item BlackBronzeChiselHead;
    public static Item BlackSteelChiselHead;
    public static Item BlueSteelChiselHead;
    public static Item BronzeChiselHead;
    public static Item CopperChiselHead;
    public static Item WroughtIronChiselHead;
    public static Item RedSteelChiselHead;
    public static Item RoseGoldChiselHead;
    public static Item SteelChiselHead;
    public static Item TinChiselHead;
    public static Item ZincChiselHead;

    public static Item BismuthSwordHead;
    public static Item BismuthBronzeSwordHead;
    public static Item BlackBronzeSwordHead;
    public static Item BlackSteelSwordHead;
    public static Item BlueSteelSwordHead;
    public static Item BronzeSwordHead;
    public static Item CopperSwordHead;
    public static Item WroughtIronSwordHead;
    public static Item RedSteelSwordHead;
    public static Item RoseGoldSwordHead;
    public static Item SteelSwordHead;
    public static Item TinSwordHead;
    public static Item ZincSwordHead;

    public static Item BismuthMaceHead;
    public static Item BismuthBronzeMaceHead;
    public static Item BlackBronzeMaceHead;
    public static Item BlackSteelMaceHead;
    public static Item BlueSteelMaceHead;
    public static Item BronzeMaceHead;
    public static Item CopperMaceHead;
    public static Item WroughtIronMaceHead;
    public static Item RedSteelMaceHead;
    public static Item RoseGoldMaceHead;
    public static Item SteelMaceHead;
    public static Item TinMaceHead;
    public static Item ZincMaceHead;

    public static Item BismuthSawHead;
    public static Item BismuthBronzeSawHead;
    public static Item BlackBronzeSawHead;
    public static Item BlackSteelSawHead;
    public static Item BlueSteelSawHead;
    public static Item BronzeSawHead;
    public static Item CopperSawHead;
    public static Item WroughtIronSawHead;
    public static Item RedSteelSawHead;
    public static Item RoseGoldSawHead;
    public static Item SteelSawHead;
    public static Item TinSawHead;
    public static Item ZincSawHead;

    public static Item BismuthProPickHead;
    public static Item BismuthBronzeProPickHead;
    public static Item BlackBronzeProPickHead;
    public static Item BlackSteelProPickHead;
    public static Item BlueSteelProPickHead;
    public static Item BronzeProPickHead;
    public static Item CopperProPickHead;
    public static Item WroughtIronProPickHead;
    public static Item RedSteelProPickHead;
    public static Item RoseGoldProPickHead;
    public static Item SteelProPickHead;
    public static Item TinProPickHead;
    public static Item ZincProPickHead;
    
    public static Item BismuthScytheHead;
    public static Item BismuthBronzeScytheHead;
    public static Item BlackBronzeScytheHead;
    public static Item BlackSteelScytheHead;
    public static Item BlueSteelScytheHead;
    public static Item BronzeScytheHead;
    public static Item CopperScytheHead;
    public static Item WroughtIronScytheHead;
    public static Item RedSteelScytheHead;
    public static Item RoseGoldScytheHead;
    public static Item SteelScytheHead;
    public static Item TinScytheHead;
    public static Item ZincScytheHead;
    
    public static Item BismuthKnifeHead;
    public static Item BismuthBronzeKnifeHead;
    public static Item BlackBronzeKnifeHead;
    public static Item BlackSteelKnifeHead;
    public static Item BlueSteelKnifeHead;
    public static Item BronzeKnifeHead;
    public static Item CopperKnifeHead;
    public static Item WroughtIronKnifeHead;
    public static Item RedSteelKnifeHead;
    public static Item RoseGoldKnifeHead;
    public static Item SteelKnifeHead;
    public static Item TinKnifeHead;
    public static Item ZincKnifeHead;

    public static Item Coke;
    public static Item Flux;

    //Formerly TFC_Mining
    
    public static Item terraGoldPan;
    public static Item terraSluiceItem;

    public static Item terraProPickStone;
    public static Item terraProPickBismuth; 
    public static Item terraProPickBismuthBronze;   
    public static Item terraProPickBlackBronze;
    public static Item terraProPickBlackSteel;
    public static Item terraProPickBlueSteel;
    public static Item terraProPickBronze;
    public static Item terraProPickCopper;
    public static Item terraProPickIron;
    public static Item terraProPickRedSteel;
    public static Item terraProPickRoseGold;
    public static Item terraProPickSteel;
    public static Item terraProPickTin;
    public static Item terraProPickZinc;

    /**Armor Crafting related items*/
    public static Item BismuthSheet;
    public static Item BismuthBronzeSheet;
    public static Item BlackBronzeSheet;
    public static Item BlackSteelSheet;
    public static Item BlueSteelSheet;
    public static Item BronzeSheet;
    public static Item CopperSheet;
    public static Item WroughtIronSheet;
    public static Item RedSteelSheet;
    public static Item RoseGoldSheet;
    public static Item SteelSheet;
    public static Item TinSheet;
    public static Item ZincSheet;

    public static Item BismuthSheet2x;
    public static Item BismuthBronzeSheet2x;
    public static Item BlackBronzeSheet2x;
    public static Item BlackSteelSheet2x;
    public static Item BlueSteelSheet2x;
    public static Item BronzeSheet2x;
    public static Item CopperSheet2x;
    public static Item WroughtIronSheet2x;
    public static Item RedSteelSheet2x;
    public static Item RoseGoldSheet2x;
    public static Item SteelSheet2x;
    public static Item TinSheet2x;
    public static Item ZincSheet2x;

    public static Item BismuthUnfinishedChestplate;
    public static Item BismuthBronzeUnfinishedChestplate;
    public static Item BlackBronzeUnfinishedChestplate;
    public static Item BlackSteelUnfinishedChestplate;
    public static Item BlueSteelUnfinishedChestplate;
    public static Item BronzeUnfinishedChestplate;
    public static Item CopperUnfinishedChestplate;
    public static Item WroughtIronUnfinishedChestplate;
    public static Item RedSteelUnfinishedChestplate;
    public static Item RoseGoldUnfinishedChestplate;
    public static Item SteelUnfinishedChestplate;
    public static Item TinUnfinishedChestplate;
    public static Item ZincUnfinishedChestplate;

    public static Item BismuthUnfinishedGreaves;
    public static Item BismuthBronzeUnfinishedGreaves;
    public static Item BlackBronzeUnfinishedGreaves;
    public static Item BlackSteelUnfinishedGreaves;
    public static Item BlueSteelUnfinishedGreaves;
    public static Item BronzeUnfinishedGreaves;
    public static Item CopperUnfinishedGreaves;
    public static Item WroughtIronUnfinishedGreaves;
    public static Item RedSteelUnfinishedGreaves;
    public static Item RoseGoldUnfinishedGreaves;
    public static Item SteelUnfinishedGreaves;
    public static Item TinUnfinishedGreaves;
    public static Item ZincUnfinishedGreaves;

    public static Item BismuthUnfinishedBoots;
    public static Item BismuthBronzeUnfinishedBoots;
    public static Item BlackBronzeUnfinishedBoots;
    public static Item BlackSteelUnfinishedBoots;
    public static Item BlueSteelUnfinishedBoots;
    public static Item BronzeUnfinishedBoots;
    public static Item CopperUnfinishedBoots;
    public static Item WroughtIronUnfinishedBoots;
    public static Item RedSteelUnfinishedBoots;
    public static Item RoseGoldUnfinishedBoots;
    public static Item SteelUnfinishedBoots;
    public static Item TinUnfinishedBoots;
    public static Item ZincUnfinishedBoots;

    public static Item BismuthUnfinishedHelmet;
    public static Item BismuthBronzeUnfinishedHelmet;
    public static Item BlackBronzeUnfinishedHelmet;
    public static Item BlackSteelUnfinishedHelmet;
    public static Item BlueSteelUnfinishedHelmet;
    public static Item BronzeUnfinishedHelmet;
    public static Item CopperUnfinishedHelmet;
    public static Item WroughtIronUnfinishedHelmet;
    public static Item RedSteelUnfinishedHelmet;
    public static Item RoseGoldUnfinishedHelmet;
    public static Item SteelUnfinishedHelmet;
    public static Item TinUnfinishedHelmet;
    public static Item ZincUnfinishedHelmet;

    public static Item BismuthChestplate;
    public static Item BismuthBronzeChestplate;
    public static Item BlackBronzeChestplate;
    public static Item BlackSteelChestplate;
    public static Item BlueSteelChestplate;
    public static Item BronzeChestplate;
    public static Item CopperChestplate;
    public static Item WroughtIronChestplate;
    public static Item RedSteelChestplate;
    public static Item RoseGoldChestplate;
    public static Item SteelChestplate;
    public static Item TinChestplate;
    public static Item ZincChestplate;

    public static Item BismuthGreaves;
    public static Item BismuthBronzeGreaves;
    public static Item BlackBronzeGreaves;
    public static Item BlackSteelGreaves;
    public static Item BlueSteelGreaves;
    public static Item BronzeGreaves;
    public static Item CopperGreaves;
    public static Item WroughtIronGreaves;
    public static Item RedSteelGreaves;
    public static Item RoseGoldGreaves;
    public static Item SteelGreaves;
    public static Item TinGreaves;
    public static Item ZincGreaves;

    public static Item BismuthBoots;
    public static Item BismuthBronzeBoots;
    public static Item BlackBronzeBoots;
    public static Item BlackSteelBoots;
    public static Item BlueSteelBoots;
    public static Item BronzeBoots;
    public static Item CopperBoots;
    public static Item WroughtIronBoots;
    public static Item RedSteelBoots;
    public static Item RoseGoldBoots;
    public static Item SteelBoots;
    public static Item TinBoots;
    public static Item ZincBoots;

    public static Item BismuthHelmet;
    public static Item BismuthBronzeHelmet;
    public static Item BlackBronzeHelmet;
    public static Item BlackSteelHelmet;
    public static Item BlueSteelHelmet;
    public static Item BronzeHelmet;
    public static Item CopperHelmet;
    public static Item WroughtIronHelmet;
    public static Item RedSteelHelmet;
    public static Item RoseGoldHelmet;
    public static Item SteelHelmet;
    public static Item TinHelmet;
    public static Item ZincHelmet;
    
    public static Item WoodenBucketEmpty;
    public static Item WoodenBucketWater;
    public static Item WoodenBucketMilk;
    
    /**Food Related Items and Blocks*/
    public static Item SeedsWheat;
    public static Item SeedsMelon;
    public static Item SeedsPumpkin;
    
    public static Item FruitTreeSapling1;
    public static Item FruitTreeSapling2;
    
    public static Item RedApple;
    public static Item GreenApple;
    public static Item Banana;
    public static Item Orange;
    public static Item Lemon;
    public static Item Olive;
    public static Item Cherry;
    public static Item Peach;
    public static Item Plum;
    public static Item Egg;
    public static Item EggCooked;
    
    public static Item LooseRock;
    public static Item FlatRock;
    
    public static Item IgInStonePickaxeHead;
    public static Item SedStonePickaxeHead;
    public static Item IgExStonePickaxeHead;
    public static Item MMStonePickaxeHead;
    public static Item IgInStoneShovelHead;
    public static Item SedStoneShovelHead;
    public static Item IgExStoneShovelHead;
    public static Item MMStoneShovelHead;
    public static Item IgInStoneAxeHead;
    public static Item SedStoneAxeHead;
    public static Item IgExStoneAxeHead;
    public static Item MMStoneAxeHead;
    public static Item IgInStoneHoeHead;
    public static Item SedStoneHoeHead;
    public static Item IgExStoneHoeHead;
    public static Item MMStoneHoeHead;
    
    public static Item StoneKnife;
    public static Item StoneKnifeHead;
    public static Item StoneHammerHead;
    public static Item StoneProPickHead;
    public static Item SmallOreChunk;
    public static Item SinglePlank;
    
    
    /**
     * Item Uses Setup
     * */
    public static int IgInStoneUses = 60;
    public static int IgExStoneUses = 70;
    public static int SedStoneUses = 50;
    public static int MMStoneUses = 55; 
    public static int BismuthUses = 420;
    public static int BismuthBronzeUses = 1160;
    public static int BlackBronzeUses = 1060;
    public static int BlackSteelUses = 3000;
    public static int BlueSteelUses = 4000;
    public static int BronzeUses = 1200;
    public static int CopperUses = 820;
    public static int WroughtIronUses = 1600;
    public static int RedSteelUses = 4000;
    public static int RoseGoldUses = 1040;
    public static int SteelUses = 2200;
    public static int TinUses = 590;
    public static int ZincUses = 560;
    
    public static EnumToolMaterial IgInToolMaterial = EnumHelper.addToolMaterial("IgIn", 1, IgInStoneUses, 7F, 1, 5);
    public static EnumToolMaterial SedToolMaterial = EnumHelper.addToolMaterial("Sed", 1, SedStoneUses, 6F, 1, 5);
    public static EnumToolMaterial IgExToolMaterial = EnumHelper.addToolMaterial("IgEx", 1, IgExStoneUses, 7F, 1, 5);
    public static EnumToolMaterial MMToolMaterial = EnumHelper.addToolMaterial("MM", 1, MMStoneUses, 6.5F, 1, 5);

    public static EnumToolMaterial BismuthToolMaterial = EnumHelper.addToolMaterial("Bismuth", 2, BismuthUses, 9.0F, 2, 10);
    public static EnumToolMaterial BismuthBronzeToolMaterial = EnumHelper.addToolMaterial("BismuthBronze", 2, BismuthBronzeUses, 11.5F, 3, 10);
    public static EnumToolMaterial BlackBronzeToolMaterial = EnumHelper.addToolMaterial("BlackBronze", 2, BlackBronzeUses, 11F, 4, 10);
    public static EnumToolMaterial BlackSteelToolMaterial = EnumHelper.addToolMaterial("BlackSteel", 2, BlackSteelUses, 18F, 6, 12);
    public static EnumToolMaterial BlueSteelToolMaterial = EnumHelper.addToolMaterial("BlueSteel", 3, BlueSteelUses, 21F, 7, 22);
    public static EnumToolMaterial BronzeToolMaterial = EnumHelper.addToolMaterial("Bronze", 2, BronzeUses, 15F, 4, 13);
    public static EnumToolMaterial CopperToolMaterial = EnumHelper.addToolMaterial("Copper", 2, CopperUses, 10.0F, 3, 8);
    public static EnumToolMaterial IronToolMaterial = EnumHelper.addToolMaterial("Iron", 2, WroughtIronUses, 16F, 5, 10);
    public static EnumToolMaterial RedSteelToolMaterial = EnumHelper.addToolMaterial("RedSteel", 3, RedSteelUses, 21F, 7, 22);
    public static EnumToolMaterial RoseGoldToolMaterial = EnumHelper.addToolMaterial("RoseGold", 2, RoseGoldUses, 11F, 4, 20);
    public static EnumToolMaterial SteelToolMaterial = EnumHelper.addToolMaterial("Steel", 2, SteelUses, 17F, 6, 10);
    public static EnumToolMaterial TinToolMaterial = EnumHelper.addToolMaterial("Tin", 2, TinUses, 9.0F, 2, 8);
    public static EnumToolMaterial ZincToolMaterial = EnumHelper.addToolMaterial("Zinc", 2, ZincUses, 9.0F, 2, 8);
    
    public static Item[] MeltedMetal;
    public static Item[] Hammers;
    
    static Configuration config;
    
    
    public static void Setup()
    {
        
        try
        {
            config = new Configuration(new File(ServerClientProxy.getProxy().getMinecraftDir(), "/config/TFC.cfg"));
            config.load();
        } catch (Exception e) {
            System.out.println(new StringBuilder().append("[TFC] Error while trying to access configuration!").toString());
            config = null;
        }
        
        terraGoldPan = new ItemTerraGoldPan(TFCSettings.getIntFor(config,"item","terraGoldPan",16001)).setItemName("GoldPan").setIconCoord(1, 0);
        terraSluiceItem = new ItemTerraSluice(TFCSettings.getIntFor(config,"item","terraSluiceItem",16002)).setItemName("SluiceItem").setIconCoord(9, 0);
        
        terraProPickStone = new ItemTerraProPick(TFCSettings.getIntFor(config,"item","terraProPickStone",16003)).setItemName("StoneProPick").setIconCoord(0, 1).setMaxDamage(64);
        terraProPickBismuth = new ItemTerraProPick(TFCSettings.getIntFor(config,"item","terraProPickBismuth",16004)).setItemName("BismuthProPick").setIconCoord(1, 1).setMaxDamage(128);
        terraProPickBismuthBronze = new ItemTerraProPick(TFCSettings.getIntFor(config,"item","terraProPickBismuthBronze",16005)).setItemName("BismuthBronzeProPick").setIconCoord(2, 1).setMaxDamage(180);
        terraProPickBlackBronze = new ItemTerraProPick(TFCSettings.getIntFor(config,"item","terraProPickBlackBronze",16006)).setItemName("BlackBronzeProPick").setIconCoord(3, 1).setMaxDamage(220);
        terraProPickBlackSteel = new ItemTerraProPick(TFCSettings.getIntFor(config,"item","terraProPickBlackSteel",16007)).setItemName("BlackSteelProPick").setIconCoord(4, 1).setMaxDamage(1024);
        terraProPickBlueSteel = new ItemTerraProPick(TFCSettings.getIntFor(config,"item","terraProPickBlueSteel",16008)).setItemName("BlueSteelProPick").setIconCoord(5, 1).setMaxDamage(1800);
        terraProPickBronze = new ItemTerraProPick(TFCSettings.getIntFor(config,"item","terraProPickBronze",16009)).setItemName("BronzeProPick").setIconCoord(6, 1).setMaxDamage(180);
        terraProPickCopper = new ItemTerraProPick(TFCSettings.getIntFor(config,"item","terraProPickCopper",16010)).setItemName("CopperProPick").setIconCoord(7, 1).setMaxDamage(180);
        terraProPickIron = new ItemTerraProPick(TFCSettings.getIntFor(config,"item","terraProPickWroughtIron",16012)).setItemName("WroughtIronProPick").setIconCoord(8, 1).setMaxDamage(256);
        terraProPickRedSteel = new ItemTerraProPick(TFCSettings.getIntFor(config,"item","terraProPickRedSteel",16016)).setItemName("RedSteelProPick").setIconCoord(9, 1).setMaxDamage(1800);
        terraProPickRoseGold = new ItemTerraProPick(TFCSettings.getIntFor(config,"item","terraProPickRoseGold",16017)).setItemName("RoseGoldProPick").setIconCoord(10, 1).setMaxDamage(190);
        terraProPickSteel = new ItemTerraProPick(TFCSettings.getIntFor(config,"item","terraProPickSteel",16019)).setItemName("SteelProPick").setIconCoord(11, 1).setMaxDamage(768);
        terraProPickTin = new ItemTerraProPick(TFCSettings.getIntFor(config,"item","terraProPickTin",16021)).setItemName("TinProPick").setIconCoord(12, 1).setMaxDamage(96);
        terraProPickZinc = new ItemTerraProPick(TFCSettings.getIntFor(config,"item","terraProPickZinc",16022)).setItemName("ZincProPick").setIconCoord(13, 1).setMaxDamage(160);
        
        BismuthIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraBismuthIngot",16028)).setItemName("terraBismuthIngot").setIconCoord(0, 3);
        BismuthBronzeIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraBismuthBronzeIngot",16029)).setItemName("terraBismuthBronzeIngot").setIconCoord(1, 3);
        BlackBronzeIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraBlackBronzeIngot",16030)).setItemName("terraBlackBronzeIngot").setIconCoord(2, 3);
        BlackSteelIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraBlackSteelIngot",16031)).setItemName("terraBlackSteelIngot").setIconCoord(3, 3);
        BlueSteelIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraBlueSteelIngot",16032)).setItemName("terraBlueSteelIngot").setIconCoord(4, 3);
        BrassIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraBrassIngot",16033)).setItemName("terraBrassIngot").setIconCoord(5, 3);
        BronzeIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraBronzeIngot",16034)).setItemName("terraBronzeIngot").setIconCoord(6, 3);
        CopperIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraCopperIngot",16035)).setItemName("terraCopperIngot").setIconCoord(7, 3);
        GoldIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraGoldIngot",16036)).setItemName("terraGoldIngot").setIconCoord(8, 3);
        WroughtIronIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraWroughtIronIngot",16037)).setItemName("terraWroughtIronIngot").setIconCoord(9, 3);
        LeadIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraLeadIngot",16038)).setItemName("terraLeadIngot").setIconCoord(10, 3);
        NickelIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraNickelIngot",16039)).setItemName("terraNickelIngot").setIconCoord(0, 4);
        PigIronIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraPigIronIngot",16040)).setItemName("terraPigIronIngot").setIconCoord(1, 4);
        PlatinumIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraPlatinumIngot",16041)).setItemName("terraPlatinumIngot").setIconCoord(2, 4);
        RedSteelIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraRedSteelIngot",16042)).setItemName("terraRedSteelIngot").setIconCoord(3, 4);
        RoseGoldIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraRoseGoldIngot",16043)).setItemName("terraRoseGoldIngot").setIconCoord(4, 4);
        SilverIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraSilverIngot",16044)).setItemName("terraSilverIngot").setIconCoord(5, 4);
        SteelIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraSteelIngot",16045)).setItemName("terraSteelIngot").setIconCoord(6, 4);
        SterlingSilverIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraSterlingSilverIngot",16046)).setItemName("terraSterlingSilverIngot").setIconCoord(7, 4);
        TinIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraTinIngot",16047)).setItemName("terraTinIngot").setIconCoord(8, 4);
        ZincIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraZincIngot",16048)).setItemName("terraZincIngot").setIconCoord(9, 4);

        BismuthIngot2x = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraBismuthIngot2x",16049)).setItemName("terraBismuthIngot2x").setIconCoord(0, 7);
        BismuthBronzeIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraBismuthBronzeIngot2x",16050)).setItemName("terraBismuthBronzeIngot2x").setIconCoord(1, 7);
        BlackBronzeIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraBlackBronzeIngot2x",16051)).setItemName("terraBlackBronzeIngot2x").setIconCoord(2, 7);
        BlackSteelIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraBlackSteelIngot2x",16052)).setItemName("terraBlackSteelIngot2x").setIconCoord(3, 7);
        BlueSteelIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraBlueSteelIngot2x",16053)).setItemName("terraBlueSteelIngot2x").setIconCoord(4, 7);
        BrassIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraBrassIngot2x",16054)).setItemName("terraBrassIngot2x").setIconCoord(5, 7);
        BronzeIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraBronzeIngot2x",16055)).setItemName("terraBronzeIngot2x").setIconCoord(6, 7);
        CopperIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraCopperIngot2x",16056)).setItemName("terraCopperIngot2x").setIconCoord(7, 7);
        GoldIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraGoldIngot2x",16057)).setItemName("terraGoldIngot2x").setIconCoord(8, 7);
        WroughtIronIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraWroughtIronIngot2x",16058)).setItemName("terraWroughtIronIngot2x").setIconCoord(9, 7);
        LeadIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraLeadIngot2x",16059)).setItemName("terraLeadIngot2x").setIconCoord(10, 7);
        NickelIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraNickelIngot2x",16060)).setItemName("terraNickelIngot2x").setIconCoord(0, 8);
        PigIronIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraPigIronIngot2x",16061)).setItemName("terraPigIronIngot2x").setIconCoord(1, 8);
        PlatinumIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraPlatinumIngot2x",16062)).setItemName("terraPlatinumIngot2x").setIconCoord(2, 8);
        RedSteelIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraRedSteelIngot2x",16063)).setItemName("terraRedSteelIngot2x").setIconCoord(3, 8);
        RoseGoldIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraRoseGoldIngot2x",16064)).setItemName("terraRoseGoldIngot2x").setIconCoord(4, 8);
        SilverIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraSilverIngot2x",16065)).setItemName("terraSilverIngot2x").setIconCoord(5, 8);
        SteelIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraSteelIngot2x",16066)).setItemName("terraSteelIngot2x").setIconCoord(6, 8);
        SterlingSilverIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraSterlingSilverIngot2x",16067)).setItemName("terraSterlingSilverIngot2x").setIconCoord(7, 8);
        TinIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraTinIngot2x",16068)).setItemName("terraTinIngot2x").setIconCoord(8, 8);
        ZincIngot2x  = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraZincIngot2x",16069)).setItemName("terraZincIngot2x").setIconCoord(9, 8);

        terraSulfurPowder = new ItemTerra(TFCSettings.getIntFor(config,"item","terraSulfurPowder",16070)).setTexturePath("/bioxx/terrasprites.png").setItemName("SulfurPowder").setIconCoord(1, 0);
        terraSaltpeterPowder = new ItemTerra(TFCSettings.getIntFor(config,"item","terraSaltpeterPowder",16071)).setTexturePath("/bioxx/terrasprites.png").setItemName("SaltpeterPowder").setIconCoord(0, 0);

        terraGemRuby = new ItemTerraGem(TFCSettings.getIntFor(config,"item","terraGemRuby",16080)).setItemName("Ruby").setIconCoord(11, 3);
        terraGemSapphire = new ItemTerraGem(TFCSettings.getIntFor(config,"item","terraGemSapphire",16081)).setItemName("Sapphire").setIconCoord(11, 4);
        terraGemEmerald = new ItemTerraGem(TFCSettings.getIntFor(config,"item","terraGemEmerald",16082)).setItemName("Emerald").setIconCoord(11, 5);
        terraGemTopaz = new ItemTerraGem(TFCSettings.getIntFor(config,"item","terraGemTopaz",16083)).setItemName("Topaz").setIconCoord(11, 6);
        terraGemTourmaline = new ItemTerraGem(TFCSettings.getIntFor(config,"item","terraGemTourmaline",16084)).setItemName("Tourmaline").setIconCoord(11, 7);
        terraGemJade = new ItemTerraGem(TFCSettings.getIntFor(config,"item","terraGemJade",16085)).setItemName("Jade").setIconCoord(11, 8);
        terraGemBeryl = new ItemTerraGem(TFCSettings.getIntFor(config,"item","terraGemBeryl",16086)).setItemName("Beryl").setIconCoord(11, 9);
        terraGemAgate = new ItemTerraGem(TFCSettings.getIntFor(config,"item","terraGemAgate",16087)).setItemName("Agate").setIconCoord(11, 10);
        terraGemOpal = new ItemTerraGem(TFCSettings.getIntFor(config,"item","terraGemOpal",16088)).setItemName("Opal").setIconCoord(11, 11);
        terraGemGarnet = new ItemTerraGem(TFCSettings.getIntFor(config,"item","terraGemGarnet",16089)).setItemName("Garnet").setIconCoord(11, 12);
        terraGemJasper = new ItemTerraGem(TFCSettings.getIntFor(config,"item","terraGemJasper",16090)).setItemName("Jasper").setIconCoord(11, 13);
        terraGemAmethyst = new ItemTerraGem(TFCSettings.getIntFor(config,"item","terraGemAmethyst",16091)).setItemName("Amethyst").setIconCoord(11, 14);
        terraGemDiamond = new ItemTerraGem(TFCSettings.getIntFor(config,"item","terraGemDiamond",16092)).setItemName("Diamond").setIconCoord(11, 15);

        //Tools
        terraIgInPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraIgInPick",16100),IgInToolMaterial).setItemName("IgIn Stone Pick").setMaxDamage(IgInStoneUses).setIconCoord(0, 3);
        terraIgInShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraIgInShovel",16101),IgInToolMaterial).setItemName("IgIn Stone Shovel").setMaxDamage(IgInStoneUses).setIconCoord(0, 4);
        terraIgInAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terraIgInAxe",16102),IgInToolMaterial).setItemName("IgIn Stone Axe").setMaxDamage(IgInStoneUses).setIconCoord(0, 5);
        terraIgInHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraIgInHoe",16103),IgInToolMaterial).setItemName("IgIn Stone Hoe").setMaxDamage(IgInStoneUses).setIconCoord(0, 6);
        terraSedPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraSedPick",16104),SedToolMaterial).setItemName("Sed Stone Pick").setMaxDamage(SedStoneUses).setIconCoord(0, 3);
        terraSedShovel= new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraSedShovel",16105),SedToolMaterial).setItemName("Sed Stone Shovel").setMaxDamage(SedStoneUses).setIconCoord(0, 4);
        terraSedAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terraSedAxe",16106),SedToolMaterial).setItemName("Sed Stone Axe").setMaxDamage(SedStoneUses).setIconCoord(0, 5);
        terraSedHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraSedHoe",16107),SedToolMaterial).setItemName("Sed Stone Hoe").setMaxDamage(SedStoneUses).setIconCoord(0, 6);
        terraIgExPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraIgExPick",16108),IgExToolMaterial).setItemName("IgEx Stone Pick").setMaxDamage(IgExStoneUses).setIconCoord(0, 3);
        terraIgExShovel= new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraIgExShovel",16109),IgExToolMaterial).setItemName("IgEx Stone Shovel").setMaxDamage(IgExStoneUses).setIconCoord(0, 4);
        terraIgExAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terraIgExAxe",16110),IgExToolMaterial).setItemName("IgEx Stone Axe").setMaxDamage(IgExStoneUses).setIconCoord(0, 5);
        terraIgExHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraIgExHoe",16111),IgExToolMaterial).setItemName("IgEx Stone Hoe").setMaxDamage(IgExStoneUses).setIconCoord(0, 6);
        terraMMPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraMMPick",16112),MMToolMaterial).setItemName("MM Stone Pick").setMaxDamage(MMStoneUses).setIconCoord(0, 3);
        terraMMShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraMMShovel",16113),MMToolMaterial).setItemName("MM Stone Shovel").setMaxDamage(MMStoneUses).setIconCoord(0, 4);
        terraMMAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terraMMAxe",16114),MMToolMaterial).setItemName("MM Stone Axe").setMaxDamage(MMStoneUses).setIconCoord(0, 5);
        terraMMHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraMMHoe",16115),MMToolMaterial).setItemName("MM Stone Hoe").setMaxDamage(MMStoneUses).setIconCoord(0, 6);

        terraBismuthPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraBismuthPick",16116),BismuthToolMaterial).setItemName("Bismuth Pick").setMaxDamage(BismuthUses).setIconCoord(1, 3);
        terraBismuthShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraBismuthShovel",16117),BismuthToolMaterial).setItemName("Bismuth Shovel").setMaxDamage(BismuthUses).setIconCoord(1, 4);
        terraBismuthAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terranBismuthAxe",16118),BismuthToolMaterial).setItemName("Bismuth Axe").setMaxDamage(BismuthUses).setIconCoord(1, 5);
        terraBismuthHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraBismuthHoe",16119),BismuthToolMaterial).setItemName("Bismuth Hoe").setMaxDamage(BismuthUses).setIconCoord(1, 6);

        terraBismuthBronzePick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraBismuthBronzePick",16120),BismuthBronzeToolMaterial).setItemName("Bismuth Bronze Pick").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 3);
        terraBismuthBronzeShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraBismuthBronzeShovel",16121),BismuthBronzeToolMaterial).setItemName("Bismuth Bronze Shovel").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 4);
        terraBismuthBronzeAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terranBismuthBronzeAxe",16122),BismuthBronzeToolMaterial).setItemName("Bismuth Bronze Axe").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 5);
        terraBismuthBronzeHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraBismuthBronzeHoe",16123),BismuthBronzeToolMaterial).setItemName("Bismuth Bronze Hoe").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 6);

        terraBlackBronzePick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraBlackBronzePick",16124),BlackBronzeToolMaterial).setItemName("Black Bronze Pick").setMaxDamage(BlackBronzeUses).setIconCoord(3, 3);
        terraBlackBronzeShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraBlackBronzeShovel",16125),BlackBronzeToolMaterial).setItemName("Black Bronze Shovel").setMaxDamage(BlackBronzeUses).setIconCoord(3, 4);
        terraBlackBronzeAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terranBlackBronzeAxe",16126),BlackBronzeToolMaterial).setItemName("Black Bronze Axe").setMaxDamage(BlackBronzeUses).setIconCoord(3, 5);
        terraBlackBronzeHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraBlackBronzeHoe",16127),BlackBronzeToolMaterial).setItemName("Black Bronze Hoe").setMaxDamage(BlackBronzeUses).setIconCoord(3, 6);

        terraBlackSteelPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraBlackSteelPick",16128),BlackSteelToolMaterial).setItemName("Black Steel Pick").setMaxDamage(BlackSteelUses).setIconCoord(4, 3);
        terraBlackSteelShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraBlackSteelShovel",16129),BlackSteelToolMaterial).setItemName("Black Steel Shovel").setMaxDamage(BlackSteelUses).setIconCoord(4, 4);
        terraBlackSteelAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terranBlackSteelAxe",16130),BlackSteelToolMaterial).setItemName("Black Steel Axe").setMaxDamage(BlackSteelUses).setIconCoord(4, 5);
        terraBlackSteelHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraBlackSteelHoe",16131),BlackSteelToolMaterial).setItemName("Black Steel Hoe").setMaxDamage(BlackSteelUses).setIconCoord(4, 6);

        terraBlueSteelPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraBlueSteelPick",16132),BlueSteelToolMaterial).setItemName("Blue Steel Pick").setMaxDamage(BlueSteelUses).setIconCoord(5, 3);
        terraBlueSteelShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraBlueSteelShovel",16133),BlueSteelToolMaterial).setItemName("Blue Steel Shovel").setMaxDamage(BlueSteelUses).setIconCoord(5, 4);
        terraBlueSteelAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terranBlueSteelAxe",16134),BlueSteelToolMaterial).setItemName("Blue Steel Axe").setMaxDamage(BlueSteelUses).setIconCoord(5, 5);
        terraBlueSteelHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraBlueSteelHoe",16135),BlueSteelToolMaterial).setItemName("Blue Steel Hoe").setMaxDamage(BlueSteelUses).setIconCoord(5, 6);

        terraBronzePick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraBronzePick",16136),BronzeToolMaterial).setItemName("Bronze Pick").setMaxDamage(BronzeUses).setIconCoord(6,3);
        terraBronzeShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraBronzeShovel",16137),BronzeToolMaterial).setItemName("Bronze Shovel").setMaxDamage(BronzeUses).setIconCoord(6, 4);
        terraBronzeAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terranBronzeAxe",16138),BronzeToolMaterial).setItemName("Bronze Axe").setMaxDamage(BronzeUses).setIconCoord(6, 5);
        terraBronzeHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraBronzeHoe",16139),BronzeToolMaterial).setItemName("Bronze Hoe").setMaxDamage(BronzeUses).setIconCoord(6, 6);

        terraCopperPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraCopperPick",16140),CopperToolMaterial).setItemName("Copper Pick").setMaxDamage(CopperUses).setIconCoord(7, 3);
        terraCopperShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraCopperShovel",16141),CopperToolMaterial).setItemName("Copper Shovel").setMaxDamage(CopperUses).setIconCoord(7, 4);
        terraCopperAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terranCopperAxe",16142),CopperToolMaterial).setItemName("Copper Axe").setMaxDamage(CopperUses).setIconCoord(7, 5);
        terraCopperHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraCopperHoe",16143),CopperToolMaterial).setItemName("Copper Hoe").setMaxDamage(CopperUses).setIconCoord(7, 6);

        terraWroughtIronPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraWroughtIronPick",16148),IronToolMaterial).setItemName("Wrought Iron Pick").setMaxDamage(WroughtIronUses).setIconCoord(8, 3);
        terraWroughtIronShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraWroughtIronShovel",16149),IronToolMaterial).setItemName("Wrought Iron Shovel").setMaxDamage(WroughtIronUses).setIconCoord(8, 4);
        terraWroughtIronAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terranWroughtIronAxe",16150),IronToolMaterial).setItemName("Wrought Iron Axe").setMaxDamage(WroughtIronUses).setIconCoord(8, 5);
        terraWroughtIronHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraWroughtIronHoe",16151),IronToolMaterial).setItemName("Wrought Iron Hoe").setMaxDamage(WroughtIronUses).setIconCoord(8, 6);

        terraRedSteelPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraRedSteelPick",16168),RedSteelToolMaterial).setItemName("Red Steel Pick").setMaxDamage(RedSteelUses).setIconCoord(9, 3);
        terraRedSteelShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraRedSteelShovel",16169),RedSteelToolMaterial).setItemName("Red Steel Shovel").setMaxDamage(RedSteelUses).setIconCoord(9, 4);
        terraRedSteelAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terranRedSteelAxe",16170),RedSteelToolMaterial).setItemName("Red Steel Axe").setMaxDamage(RedSteelUses).setIconCoord(9, 5);
        terraRedSteelHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraRedSteelHoe",16171),RedSteelToolMaterial).setItemName("Red Steel Hoe").setMaxDamage(RedSteelUses).setIconCoord(9, 6);

        terraRoseGoldPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraRoseGoldPick",16172),RoseGoldToolMaterial).setItemName("Rose Gold Pick").setMaxDamage(RoseGoldUses).setIconCoord(10, 3);
        terraRoseGoldShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraRoseGoldShovel",16173),RoseGoldToolMaterial).setItemName("Rose Gold Shovel").setMaxDamage(RoseGoldUses).setIconCoord(10, 4);
        terraRoseGoldAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terranRoseGoldAxe",16174),RoseGoldToolMaterial).setItemName("Rose Gold Axe").setMaxDamage(RoseGoldUses).setIconCoord(10, 5);
        terraRoseGoldHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraRoseGoldHoe",16175),RoseGoldToolMaterial).setItemName("Rose Gold Hoe").setMaxDamage(RoseGoldUses).setIconCoord(10, 6);

        terraSteelPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraSteelPick",16180),SteelToolMaterial).setItemName("Steel Pick").setMaxDamage(SteelUses).setIconCoord(11, 3);
        terraSteelShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraSteelShovel",16181),SteelToolMaterial).setItemName("Steel Shovel").setMaxDamage(SteelUses).setIconCoord(11, 4);
        terraSteelAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terranSteelAxe",16182),SteelToolMaterial).setItemName("Steel Axe").setMaxDamage(SteelUses).setIconCoord(11, 5);
        terraSteelHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraSteelHoe",16183),SteelToolMaterial).setItemName("Steel Hoe").setMaxDamage(SteelUses).setIconCoord(11, 6);

        terraTinPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraTinPick",16188),TinToolMaterial).setItemName("Tin Pick").setMaxDamage(TinUses).setIconCoord(12, 3);
        terraTinShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraTinShovel",16189),TinToolMaterial).setItemName("Tin Shovel").setMaxDamage(TinUses).setIconCoord(12, 4);
        terraTinAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terranTinAxe",16190),TinToolMaterial).setItemName("Tin Axe").setMaxDamage(TinUses).setIconCoord(12, 5);
        terraTinHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraTinHoe",16191),TinToolMaterial).setItemName("Tin Hoe").setMaxDamage(TinUses).setIconCoord(12, 6);

        terraZincPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","terraZincPick",16192),ZincToolMaterial).setItemName("Zinc Pick").setMaxDamage(ZincUses).setIconCoord(13, 3);
        terraZincShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","terraZincShovel",16193),ZincToolMaterial).setItemName("Zinc Shovel").setMaxDamage(ZincUses).setIconCoord(13, 4);
        terraZincAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","terranZincAxe",16194),ZincToolMaterial).setItemName("Zinc Axe").setMaxDamage(ZincUses).setIconCoord(13, 5);
        terraZincHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","terraZincHoe",16195),ZincToolMaterial).setItemName("Zinc Hoe").setMaxDamage(ZincUses).setIconCoord(13, 6);

        //chisels
        BismuthChisel = new ItemChisel(TFCSettings.getIntFor(config,"item","BismuthChisel",16226),BismuthToolMaterial).setItemName("Bismuth Chisel").setMaxDamage(BismuthUses).setIconCoord(1, 7);
        BismuthBronzeChisel = new ItemChisel(TFCSettings.getIntFor(config,"item","BismuthBronzeChisel",16227),BismuthBronzeToolMaterial).setItemName("Bismuth Bronze Chisel").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 7);
        BlackBronzeChisel = new ItemChisel(TFCSettings.getIntFor(config,"item","BlackBronzeChisel",16228),BlackBronzeToolMaterial).setItemName("Black Bronze Chisel").setMaxDamage(BlackBronzeUses).setIconCoord(3, 7);
        BlackSteelChisel = new ItemChisel(TFCSettings.getIntFor(config,"item","BlackSteelChisel",16230),BlackSteelToolMaterial).setItemName("Black Steel Chisel").setMaxDamage(BlackSteelUses).setIconCoord(4, 7);
        BlueSteelChisel = new ItemChisel(TFCSettings.getIntFor(config,"item","BlueSteelChisel",16231),BlueSteelToolMaterial).setItemName("Blue Steel Chisel").setMaxDamage(BlueSteelUses).setIconCoord(5, 7);
        BronzeChisel = new ItemChisel(TFCSettings.getIntFor(config,"item","BronzeChisel",16232),BronzeToolMaterial).setItemName("Bronze Chisel").setMaxDamage(BronzeUses).setIconCoord(6, 7);
        CopperChisel = new ItemChisel(TFCSettings.getIntFor(config,"item","CopperChisel",16233),CopperToolMaterial).setItemName("Copper Chisel").setMaxDamage(CopperUses).setIconCoord(7, 7);
        WroughtIronChisel = new ItemChisel(TFCSettings.getIntFor(config,"item","WroughtIronChisel",16234),IronToolMaterial).setItemName("Wrought Iron Chisel").setMaxDamage(WroughtIronUses).setIconCoord(8, 7);
        RedSteelChisel = new ItemChisel(TFCSettings.getIntFor(config,"item","RedSteelChisel",16235),RedSteelToolMaterial).setItemName("Red Steel Chisel").setMaxDamage(RedSteelUses).setIconCoord(9, 7);
        RoseGoldChisel = new ItemChisel(TFCSettings.getIntFor(config,"item","RoseGoldChisel",16236),RoseGoldToolMaterial).setItemName("Rose Gold Chisel").setMaxDamage(RoseGoldUses).setIconCoord(10, 7);
        SteelChisel = new ItemChisel(TFCSettings.getIntFor(config,"item","SteelChisel",16237),SteelToolMaterial).setItemName("Steel Chisel").setMaxDamage(SteelUses).setIconCoord(11, 7);
        TinChisel = new ItemChisel(TFCSettings.getIntFor(config,"item","TinChisel",16238),TinToolMaterial).setItemName("Tin Chisel").setMaxDamage(TinUses).setIconCoord(12, 7);
        ZincChisel = new ItemChisel(TFCSettings.getIntFor(config,"item","ZincChisel",16239),ZincToolMaterial).setItemName("Zinc Chisel").setMaxDamage(ZincUses).setIconCoord(13, 7);
        StoneChisel = new ItemChisel(TFCSettings.getIntFor(config,"item","StoneChisel",16240),IgInToolMaterial).setItemName("Stone Chisel").setMaxDamage(IgInStoneUses).setIconCoord(0, 7);

        BismuthSword = new ItemTerraSword(TFCSettings.getIntFor(config,"item","BismuthSword",16245),BismuthToolMaterial).setItemName("Bismuth Sword").setMaxDamage(BismuthUses).setIconCoord(1, 13);
        BismuthBronzeSword = new ItemTerraSword(TFCSettings.getIntFor(config,"item","BismuthBronzeSword",16246),BismuthBronzeToolMaterial).setItemName("Bismuth Bronze Sword").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 13);
        BlackBronzeSword = new ItemTerraSword(TFCSettings.getIntFor(config,"item","BlackBronzeSword",16247),BlackBronzeToolMaterial).setItemName("Black Bronze Sword").setMaxDamage(BlackBronzeUses).setIconCoord(3, 13);
        BlackSteelSword = new ItemTerraSword(TFCSettings.getIntFor(config,"item","BlackSteelSword",16248),BlackSteelToolMaterial).setItemName("Black Steel Sword").setMaxDamage(BlackSteelUses).setIconCoord(4, 13);
        BlueSteelSword = new ItemTerraSword(TFCSettings.getIntFor(config,"item","BlueSteelSword",16249),BlueSteelToolMaterial).setItemName("Blue Steel Sword").setMaxDamage(BlueSteelUses).setIconCoord(5, 13);
        BronzeSword = new ItemTerraSword(TFCSettings.getIntFor(config,"item","BronzeSword",16250),BronzeToolMaterial).setItemName("Bronze Sword").setMaxDamage(BronzeUses).setIconCoord(6, 13);
        CopperSword = new ItemTerraSword(TFCSettings.getIntFor(config,"item","CopperSword",16251),CopperToolMaterial).setItemName("Copper Sword").setMaxDamage(CopperUses).setIconCoord(7, 13);
        WroughtIronSword = new ItemTerraSword(TFCSettings.getIntFor(config,"item","WroughtIronSword",16252),IronToolMaterial).setItemName("Wrought Iron Sword").setMaxDamage(WroughtIronUses).setIconCoord(8, 13);
        RedSteelSword = new ItemTerraSword(TFCSettings.getIntFor(config,"item","RedSteelSword",16253),RedSteelToolMaterial).setItemName("Red Steel Sword").setMaxDamage(RedSteelUses).setIconCoord(9, 13);
        RoseGoldSword = new ItemTerraSword(TFCSettings.getIntFor(config,"item","RoseGoldSword",16254),RoseGoldToolMaterial).setItemName("Rose Gold Sword").setMaxDamage(RoseGoldUses).setIconCoord(10, 13);
        SteelSword = new ItemTerraSword(TFCSettings.getIntFor(config,"item","SteelSword",16255),SteelToolMaterial).setItemName("Steel Sword").setMaxDamage(SteelUses).setIconCoord(11, 13);
        TinSword = new ItemTerraSword(TFCSettings.getIntFor(config,"item","TinSword",16256),TinToolMaterial).setItemName("Tin Sword").setMaxDamage(TinUses).setIconCoord(12, 13);
        ZincSword = new ItemTerraSword(TFCSettings.getIntFor(config,"item","ZincSword",16257),ZincToolMaterial).setItemName("Zinc Sword").setMaxDamage(ZincUses).setIconCoord(13, 13);

        BismuthMace = new ItemTerraSword(TFCSettings.getIntFor(config,"item","BismuthMace",16262),BismuthToolMaterial).setItemName("Bismuth Mace").setMaxDamage(BismuthUses).setIconCoord(1, 12);
        BismuthBronzeMace = new ItemTerraSword(TFCSettings.getIntFor(config,"item","BismuthBronzeMace",16263),BismuthBronzeToolMaterial).setItemName("Bismuth Bronze Mace").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 12);
        BlackBronzeMace = new ItemTerraSword(TFCSettings.getIntFor(config,"item","BlackBronzeMace",16264),BlackBronzeToolMaterial).setItemName("Black Bronze Mace").setMaxDamage(BlackBronzeUses).setIconCoord(3, 12);
        BlackSteelMace = new ItemTerraSword(TFCSettings.getIntFor(config,"item","BlackSteelMace",16265),BlackSteelToolMaterial).setItemName("Black Steel Mace").setMaxDamage(BlackSteelUses).setIconCoord(4, 12);
        BlueSteelMace = new ItemTerraSword(TFCSettings.getIntFor(config,"item","BlueSteelMace",16266),BlueSteelToolMaterial).setItemName("Blue Steel Mace").setMaxDamage(BlueSteelUses).setIconCoord(5, 12);
        BronzeMace = new ItemTerraSword(TFCSettings.getIntFor(config,"item","BronzeMace",16267),BronzeToolMaterial).setItemName("Bronze Mace").setMaxDamage(BronzeUses).setIconCoord(6, 12);
        CopperMace = new ItemTerraSword(TFCSettings.getIntFor(config,"item","CopperMace",16268),CopperToolMaterial).setItemName("Copper Mace").setMaxDamage(CopperUses).setIconCoord(7, 12);
        WroughtIronMace = new ItemTerraSword(TFCSettings.getIntFor(config,"item","WroughtIronMace",16269),IronToolMaterial).setItemName("Wrought Iron Mace").setMaxDamage(WroughtIronUses).setIconCoord(8, 12);
        RedSteelMace = new ItemTerraSword(TFCSettings.getIntFor(config,"item","RedSteelMace",16270),RedSteelToolMaterial).setItemName("Red Steel Mace").setMaxDamage(RedSteelUses).setIconCoord(9, 12);
        RoseGoldMace = new ItemTerraSword(TFCSettings.getIntFor(config,"item","RoseGoldMace",16271),RoseGoldToolMaterial).setItemName("Rose Gold Mace").setMaxDamage(RoseGoldUses).setIconCoord(10, 12);
        SteelMace = new ItemTerraSword(TFCSettings.getIntFor(config,"item","SteelMace",16272),SteelToolMaterial).setItemName("Steel Mace").setMaxDamage(SteelUses).setIconCoord(11, 12);
        TinMace = new ItemTerraSword(TFCSettings.getIntFor(config,"item","TinMace",16273),TinToolMaterial).setItemName("Tin Mace").setMaxDamage(TinUses).setIconCoord(12, 12);
        ZincMace = new ItemTerraSword(TFCSettings.getIntFor(config,"item","ZincMace",16274),ZincToolMaterial).setItemName("Zinc Mace").setMaxDamage(ZincUses).setIconCoord(13, 12);

        BismuthSaw = new ItemCustomSaw(TFCSettings.getIntFor(config,"item","BismuthSaw",16275),BismuthToolMaterial).setItemName("Bismuth Saw").setMaxDamage(BismuthUses).setIconCoord(1, 8);
        BismuthBronzeSaw = new ItemCustomSaw(TFCSettings.getIntFor(config,"item","BismuthBronzeSaw",16276),BismuthBronzeToolMaterial).setItemName("Bismuth Bronze Saw").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 8);
        BlackBronzeSaw = new ItemCustomSaw(TFCSettings.getIntFor(config,"item","BlackBronzeSaw",16277),BlackBronzeToolMaterial).setItemName("Black Bronze Saw").setMaxDamage(BlackBronzeUses).setIconCoord(3, 8);
        BlackSteelSaw = new ItemCustomSaw(TFCSettings.getIntFor(config,"item","BlackSteelSaw",16278),BlackSteelToolMaterial).setItemName("Black Steel Saw").setMaxDamage(BlackSteelUses).setIconCoord(4, 8);
        BlueSteelSaw = new ItemCustomSaw(TFCSettings.getIntFor(config,"item","BlueSteelSaw",16279),BlueSteelToolMaterial).setItemName("Blue Steel Saw").setMaxDamage(BlueSteelUses).setIconCoord(5, 8);
        BronzeSaw = new ItemCustomSaw(TFCSettings.getIntFor(config,"item","BronzeSaw",16280),BronzeToolMaterial).setItemName("Bronze Saw").setMaxDamage(BronzeUses).setIconCoord(6, 8);
        CopperSaw = new ItemCustomSaw(TFCSettings.getIntFor(config,"item","CopperSaw",16281),CopperToolMaterial).setItemName("Copper Saw").setMaxDamage(CopperUses).setIconCoord(7, 8);
        WroughtIronSaw = new ItemCustomSaw(TFCSettings.getIntFor(config,"item","WroughtIronSaw",16282),IronToolMaterial).setItemName("Wrought Iron Saw").setMaxDamage(WroughtIronUses).setIconCoord(8, 8);
        RedSteelSaw = new ItemCustomSaw(TFCSettings.getIntFor(config,"item","RedSteelSaw",16283),RedSteelToolMaterial).setItemName("Red Steel Saw").setMaxDamage(RedSteelUses).setIconCoord(9, 8);
        RoseGoldSaw = new ItemCustomSaw(TFCSettings.getIntFor(config,"item","RoseGoldSaw",16284),RoseGoldToolMaterial).setItemName("Rose Gold Saw").setMaxDamage(RoseGoldUses).setIconCoord(10, 8);
        SteelSaw = new ItemCustomSaw(TFCSettings.getIntFor(config,"item","SteelSaw",16285),SteelToolMaterial).setItemName("Steel Saw").setMaxDamage(SteelUses).setIconCoord(11, 8);
        TinSaw = new ItemCustomSaw(TFCSettings.getIntFor(config,"item","TinSaw",16286),TinToolMaterial).setItemName("Tin Saw").setMaxDamage(TinUses).setIconCoord(12, 8);
        ZincSaw = new ItemCustomSaw(TFCSettings.getIntFor(config,"item","ZincSaw",16287),ZincToolMaterial).setItemName("Zinc Saw").setMaxDamage(ZincUses).setIconCoord(13, 8);

        HCBlackSteelIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraHCBlackSteelIngot",16290)).setItemName("terraHCBlackSteelIngot").setIconCoord(3, 3);
        WeakBlueSteelIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraWeakBlueSteelIngot",16291)).setItemName("terraWeakBlueSteelIngot").setIconCoord(4, 3);
        WeakRedSteelIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraWeakRedSteelIngot",16292)).setItemName("terraWeakRedSteelIngot").setIconCoord(3, 4);
        WeakSteelIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraWeakSteelIngot",16293)).setItemName("terraWeakSteelIngot").setIconCoord(6, 4);
        HCBlueSteelIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraHCBlueSteelIngot",16294)).setItemName("terraHCBlueSteelIngot").setIconCoord(4, 3);
        HCRedSteelIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraHCRedSteelIngot",16295)).setItemName("terraHCRedSteelIngot").setIconCoord(3, 4);
        HCSteelIngot = new ItemTerraIngot(TFCSettings.getIntFor(config,"item","terraHCSteelIngot",16296)).setItemName("terraHCSteelIngot").setIconCoord(6, 4);

        OreChunk = new ItemTerraOre(TFCSettings.getIntFor(config,"item","OreChunk",16297)).setItemName("Ore").setIconCoord(0, 3);
        Logs = new ItemTerraLogs(TFCSettings.getIntFor(config,"item","Logs",16298)).setItemName("Log").setIconCoord(0, 2);
        FlintPaxel = new ItemCustomPaxel(TFCSettings.getIntFor(config,"item","flintPaxel",16299)).setItemName("flintPaxel").setIconCoord(10, 0);

        terraWoodSupportItemV = new ItemTerraWoodSupport(TFCSettings.getIntFor(config,"item","terraWoodSupportItemV", 16300), true).setItemName("terraWoodSupportItemV").setIconCoord(0, 0);
        terraWoodSupportItemH = new ItemTerraWoodSupport(TFCSettings.getIntFor(config,"item","terraWoodSupportItemH", 16301), false).setItemName("terraWoodSupportItemH").setIconCoord(0, 1);
        boneIgInPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","boneIgInPick",16302),IgInToolMaterial).setItemName("Bone IgIn Stone Pick").setMaxDamage(IgInStoneUses).setIconCoord(14, 3);
        boneIgInShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","boneIgInShovel",16303),IgInToolMaterial).setItemName("Bone IgIn Stone Shovel").setMaxDamage(IgInStoneUses).setIconCoord(14, 4);
        boneIgInAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","boneIgInAxe",16304),IgInToolMaterial).setItemName("Bone IgIn Stone Axe").setMaxDamage(IgInStoneUses).setIconCoord(14, 5);
        boneIgInHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","boneIgInHoe",16305),IgInToolMaterial).setItemName("Bone IgIn Stone Hoe").setMaxDamage(IgInStoneUses).setIconCoord(14, 6);
        boneSedPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","boneSedPick",16306),SedToolMaterial).setItemName("Bone Sed Stone Pick").setMaxDamage(SedStoneUses).setIconCoord(14, 3);
        boneSedShovel= new ItemCustomShovel(TFCSettings.getIntFor(config,"item","boneSedShovel",16307),SedToolMaterial).setItemName("Bone Sed Stone Shovel").setMaxDamage(SedStoneUses).setIconCoord(14, 4);
        boneSedAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","boneSedAxe",16308),SedToolMaterial).setItemName("Bone Sed Stone Axe").setMaxDamage(SedStoneUses).setIconCoord(14, 5);
        boneSedHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","boneSedHoe",16309),SedToolMaterial).setItemName("Bone Sed Stone Hoe").setMaxDamage(SedStoneUses).setIconCoord(14, 6);
        boneIgExPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","boneIgExPick",16310),IgExToolMaterial).setItemName("Bone IgEx Stone Pick").setMaxDamage(IgExStoneUses).setIconCoord(14, 3);
        boneIgExShovel= new ItemCustomShovel(TFCSettings.getIntFor(config,"item","boneIgExShovel",16311),IgExToolMaterial).setItemName("Bone IgEx Stone Shovel").setMaxDamage(IgExStoneUses).setIconCoord(14, 4);
        boneIgExAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","boneIgExAxe",16312),IgExToolMaterial).setItemName("Bone IgEx Stone Axe").setMaxDamage(IgExStoneUses).setIconCoord(14, 5);
        boneIgExHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","boneIgExHoe",16313),IgExToolMaterial).setItemName("Bone IgEx Stone Hoe").setMaxDamage(IgExStoneUses).setIconCoord(14, 6);
        boneMMPick = new ItemCustomPickaxe(TFCSettings.getIntFor(config,"item","boneMMPick",16314),MMToolMaterial).setItemName("Bone MM Stone Pick").setMaxDamage(MMStoneUses).setIconCoord(14, 3);
        boneMMShovel = new ItemCustomShovel(TFCSettings.getIntFor(config,"item","boneMMShovel",16315),MMToolMaterial).setItemName("Bone MM Stone Shovel").setMaxDamage(MMStoneUses).setIconCoord(14, 4);
        boneMMAxe = new ItemCustomAxe(TFCSettings.getIntFor(config,"item","boneMMAxe",16316),MMToolMaterial).setItemName("Bone MM Stone Axe").setMaxDamage(MMStoneUses).setIconCoord(14, 5);
        boneMMHoe = new ItemCustomHoe(TFCSettings.getIntFor(config,"item","boneMMHoe",16317),MMToolMaterial).setItemName("Bone MM Stone Hoe").setMaxDamage(MMStoneUses).setIconCoord(14, 6);
        Javelin = new ItemTerraJavelin(TFCSettings.getIntFor(config,"item","javelin",16318)).setItemName("javelin").setIconCoord(15, 1);

        Item.itemsList[Item.dyePowder.shiftedIndex] = null;
        Item.itemsList[Item.dyePowder.shiftedIndex] = new ItemDyeCustom(95).setIconCoord(14, 4).setItemName("dyePowder");
        
        terraSlag = new ItemTerra(TFCSettings.getIntFor(config,"item","terraSlag",16349),"/bioxx/terrasprites.png").setItemName("terraSlag").setIconCoord(2, 0);

        BismuthUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedBismuth",16350)).setItemName("UnshapedBismuth").setIconCoord(0, 9);
        BismuthBronzeUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedBismuthBronze",16351)).setItemName("UnshapedBismuthBronze").setIconCoord(1, 9);
        BlackBronzeUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedBlackBronze",16352)).setItemName("UnshapedBlackBronze").setIconCoord(2, 9);
        BlackSteelUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedBlackSteel",16353)).setItemName("UnshapedBlackSteel").setIconCoord(3, 9);
        BlueSteelUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedBlueSteel",16354)).setItemName("UnshapedBlueSteel").setIconCoord(4, 9);
        BrassUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedBrass",16355)).setItemName("UnshapedBrass").setIconCoord(5, 9);
        BronzeUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedBronze",16356)).setItemName("UnshapedBronze").setIconCoord(6, 9);
        CopperUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedCopper",16357)).setItemName("UnshapedCopper").setIconCoord(7, 9);
        GoldUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedGold",16358)).setItemName("UnshapedGold").setIconCoord(8, 9);
        WroughtIronUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedIron",16359)).setItemName("UnshapedWroughtIron").setIconCoord(9, 9);
        LeadUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedLead",16360)).setItemName("UnshapedLead").setIconCoord(10, 9);
        NickelUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedNickel",16361)).setItemName("UnshapedNickel").setIconCoord(0, 10);
        PigIronUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedPigIron",16362)).setItemName("UnshapedPigIron").setIconCoord(1, 10);
        PlatinumUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedPlatinum",16363)).setItemName("UnshapedPlatinum").setIconCoord(2, 10);
        RedSteelUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedRedSteel",16364)).setItemName("UnshapedRedSteel").setIconCoord(3, 10);
        RoseGoldUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedRoseGold",16365)).setItemName("UnshapedRoseGold").setIconCoord(4, 10);
        SilverUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedSilver",16366)).setItemName("UnshapedSilver").setIconCoord(5, 10);
        SteelUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedSteel",16367)).setItemName("UnshapedSteel").setIconCoord(6, 10);
        SterlingSilverUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedSterlingSilver",16368)).setItemName("UnshapedSterlingSilver").setIconCoord(7, 10);
        TinUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedTin",16369)).setItemName("UnshapedTin").setIconCoord(8, 10);
        ZincUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedZinc",16370)).setItemName("UnshapedZinc").setIconCoord(9, 10);

        //Hammers
        StoneHammer = new ItemHammer(TFCSettings.getIntFor(config,"item","terraStoneHammer",16371),TFCItems.IgInToolMaterial).setItemName("Stone Hammer").setIconCoord(0, 11).setMaxDamage(TFCItems.IgInStoneUses);
        BismuthHammer = new ItemHammer(TFCSettings.getIntFor(config,"item","terraBismuthHammer",16372),TFCItems.BismuthToolMaterial).setItemName("Bismuth Hammer").setIconCoord(1, 11).setMaxDamage(TFCItems.BismuthUses);
        BismuthBronzeHammer = new ItemHammer(TFCSettings.getIntFor(config,"item","terraBismuthBronzeHammer",16373),TFCItems.BismuthBronzeToolMaterial).setItemName("Bismuth Bronze Hammer").setIconCoord(2, 11).setMaxDamage(TFCItems.BismuthBronzeUses);
        BlackBronzeHammer = new ItemHammer(TFCSettings.getIntFor(config,"item","terraBlackBronzeHammer",16374),TFCItems.BlackBronzeToolMaterial).setItemName("Black Bronze Hammer").setIconCoord(3, 11).setMaxDamage(TFCItems.BlackBronzeUses);
        BlackSteelHammer = new ItemHammer(TFCSettings.getIntFor(config,"item","terraBlackSteelHammer",16375),TFCItems.BlackSteelToolMaterial).setItemName("Black Steel Hammer").setIconCoord(4, 11).setMaxDamage(TFCItems.BlackSteelUses);
        BlueSteelHammer = new ItemHammer(TFCSettings.getIntFor(config,"item","terraBlueSteelHammer",16376),TFCItems.BlueSteelToolMaterial).setItemName("Blue Steel Hammer").setIconCoord(5, 11).setMaxDamage(TFCItems.BlueSteelUses);
        BronzeHammer = new ItemHammer(TFCSettings.getIntFor(config,"item","terraBronzeHammer",16377),TFCItems.BronzeToolMaterial).setItemName("Bronze Hammer").setIconCoord(6, 11).setMaxDamage(TFCItems.BronzeUses);
        CopperHammer = new ItemHammer(TFCSettings.getIntFor(config,"item","terraCopperHammer",16378),TFCItems.CopperToolMaterial).setItemName("Copper Hammer").setIconCoord(7, 11).setMaxDamage(TFCItems.CopperUses);
        WroughtIronHammer = new ItemHammer(TFCSettings.getIntFor(config,"item","terraWroughtIronHammer",16379),TFCItems.IronToolMaterial).setItemName("Wrought Iron Hammer").setIconCoord(8, 11).setMaxDamage(TFCItems.WroughtIronUses);
        RedSteelHammer = new ItemHammer(TFCSettings.getIntFor(config,"item","terraRedSteelHammer",16380),TFCItems.RedSteelToolMaterial).setItemName("Red Steel Hammer").setIconCoord(9, 11).setMaxDamage(TFCItems.RedSteelUses);
        RoseGoldHammer = new ItemHammer(TFCSettings.getIntFor(config,"item","terraRoseGoldHammer",16381),TFCItems.RoseGoldToolMaterial).setItemName("Rose Gold Hammer").setIconCoord(10, 11).setMaxDamage(TFCItems.RoseGoldUses);
        SteelHammer = new ItemHammer(TFCSettings.getIntFor(config,"item","terraSteelHammer",16382),TFCItems.SteelToolMaterial).setItemName("Steel Hammer").setIconCoord(11, 11).setMaxDamage(TFCItems.SteelUses);
        TinHammer = new ItemHammer(TFCSettings.getIntFor(config,"item","terraTinHammer",16383),TFCItems.TinToolMaterial).setItemName("Tin Hammer").setIconCoord(12, 11).setMaxDamage(TFCItems.TinUses);
        ZincHammer = new ItemHammer(TFCSettings.getIntFor(config,"item","terraZincHammer",16384),TFCItems.ZincToolMaterial).setItemName("Zinc Hammer").setIconCoord(13, 11).setMaxDamage(TFCItems.ZincUses);

        terraInk = new ItemTerra(TFCSettings.getIntFor(config,"item","terraInk",16391),"/bioxx/terrasprites.png").setItemName("terraInk").setIconCoord(3, 0);

        terraStoneAnvilItem = new ItemTerraAnvil(TFCSettings.getIntFor(config,"item","terraStoneAnvilItem",16398), 0, AnvilReq.STONE).setItemName("terraStoneAnvilItem").setIconCoord(0, 2);
        terraBlackSteelAnvilItem = new ItemTerraAnvil(TFCSettings.getIntFor(config,"item","terraBlackSteelAnvilItem",16399), 5, AnvilReq.BLACKSTEEL).setItemName("terraBlackSteelAnvilItem").setIconCoord(4, 2);
        terraBlueSteelAnvilItem = new ItemTerraAnvil(TFCSettings.getIntFor(config,"item","terraBlueSteelAnvilItem",16400), 7, AnvilReq.BLUESTEEL).setItemName("terraBlueSteelAnvilItem").setIconCoord(5, 2);
        terraBronzeAnvilItem = new ItemTerraAnvil(TFCSettings.getIntFor(config,"item","terraBronzeAnvilItem",16401), 2, AnvilReq.BRONZE).setItemName("terraBronzeAnvilItem").setIconCoord(6, 2);
        terraCopperAnvilItem = new ItemTerraAnvil(TFCSettings.getIntFor(config,"item","terraCopperAnvilItem",16402), 1, AnvilReq.COPPER).setItemName("terraCopperAnvilItem").setIconCoord(7, 2);
        terraWroughtIronAnvilItem = new ItemTerraAnvil(TFCSettings.getIntFor(config,"item","terraWroughtIronAnvilItem",16403), 3, AnvilReq.WROUGHTIRON).setItemName("terraWroughtIronAnvilItem").setIconCoord(8, 2);
        terraRedSteelAnvilItem = new ItemTerraAnvil(TFCSettings.getIntFor(config,"item","terraRedSteelAnvilItem",16404), 6, AnvilReq.REDSTEEL).setItemName("terraRedSteelAnvilItem").setIconCoord(9, 2);
        terraSteelAnvilItem = new ItemTerraAnvil(TFCSettings.getIntFor(config,"item","terraSteelAnvilItem",16405), 4, AnvilReq.STEEL).setItemName("terraSteelAnvilItem").setIconCoord(11, 2);

        terraBellowsItem = new ItemTerraBellows(TFCSettings.getIntFor(config,"item","terraBellowsItem",16406)).setItemName("terraBellowsItem").setIconCoord(8, 0);

        terraFireStarter = new ItemTerraFirestarter(TFCSettings.getIntFor(config,"item","terraFireStarter",16407)).setItemName("terraFireStarter").setIconCoord(7, 0);
        terraClayMold = new ItemTerra(TFCSettings.getIntFor(config,"item","terraClayMold",16408),"/bioxx/terrasprites.png").setItemName("terraClayMold").setIconCoord(10, 10);
        terraCeramicMold = new ItemTerra(TFCSettings.getIntFor(config,"item","terraFiredClayMold",16409),"/bioxx/terrasprites.png").setItemName("terraFiredClayMold").setIconCoord(10, 6);
        //Tool heads
        BismuthPickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthPickaxeHead",16500)).setItemName("Bismuth Pickaxe Head").setIconCoord(1, 3);
        BismuthBronzePickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthBronzePickaxeHead",16501)).setItemName("Bismuth Bronze Pickaxe Head").setIconCoord(2, 3);
        BlackBronzePickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackBronzePickaxeHead",16502)).setItemName("Black Bronze Pickaxe Head").setIconCoord(3, 3);
        BlackSteelPickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackSteelPickaxeHead",16503)).setItemName("Black Steel Pickaxe Head").setIconCoord(4, 3);
        BlueSteelPickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlueSteelPickaxeHead",16504)).setItemName("Blue Steel Pickaxe Head").setIconCoord(5, 3);
        BronzePickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BronzePickaxeHead",16505)).setItemName("Bronze Pickaxe Head").setIconCoord(6, 3);
        CopperPickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","CopperPickaxeHead",16506)).setItemName("Copper Pickaxe Head").setIconCoord(7, 3);
        WroughtIronPickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","WroughtIronPickaxeHead",16507)).setItemName("Wrought Iron Pickaxe Head").setIconCoord(8, 3);
        RedSteelPickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RedSteelPickaxeHead",16508)).setItemName("Red Steel Pickaxe Head").setIconCoord(9, 3);
        RoseGoldPickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RoseGoldPickaxeHead",16509)).setItemName("Rose Gold Pickaxe Head").setIconCoord(10, 3);
        SteelPickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SteelPickaxeHead",16510)).setItemName("Steel Pickaxe Head").setIconCoord(11, 3);
        TinPickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","TinPickaxeHead",16511)).setItemName("Tin Pickaxe Head").setIconCoord(12, 3);
        ZincPickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","ZincPickaxeHead",16512)).setItemName("Zinc Pickaxe Head").setIconCoord(13, 3);

        BismuthShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthShovelHead",16513)).setItemName("Bismuth Shovel Head").setIconCoord(1, 4);
        BismuthBronzeShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthBronzeShovelHead",16514)).setItemName("Bismuth Bronze Shovel Head").setIconCoord(2, 4);
        BlackBronzeShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackBronzeShovelHead",16515)).setItemName("Black Bronze Shovel Head").setIconCoord(3, 4);
        BlackSteelShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackSteelShovelHead",16516)).setItemName("Black Steel Shovel Head").setIconCoord(4, 4);
        BlueSteelShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlueSteelShovelHead",16517)).setItemName("Blue Steel Shovel Head").setIconCoord(5, 4);
        BronzeShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BronzeShovelHead",16518)).setItemName("Bronze Shovel Head").setIconCoord(6, 4);
        CopperShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","CopperShovelHead",16519)).setItemName("Copper Shovel Head").setIconCoord(7, 4);
        WroughtIronShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","WroughtIronShovelHead",16520)).setItemName("Wrought Iron Shovel Head").setIconCoord(8, 4);
        RedSteelShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RedSteelShovelHead",16521)).setItemName("Red Steel Shovel Head").setIconCoord(9, 4);
        RoseGoldShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RoseGoldShovelHead",16522)).setItemName("Rose Gold Shovel Head").setIconCoord(10, 4);
        SteelShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SteelShovelHead",16523)).setItemName("Steel Shovel Head").setIconCoord(11, 4);
        TinShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","TinShovelHead",16524)).setItemName("Tin Shovel Head").setIconCoord(12, 4);
        ZincShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","ZincShovelHead",16525)).setItemName("Zinc Shovel Head").setIconCoord(13, 4);

        BismuthHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthHoeHead",16526)).setItemName("Bismuth Hoe Head").setIconCoord(1, 6);
        BismuthBronzeHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthBronzeHoeHead",16527)).setItemName("Bismuth Bronze Hoe Head").setIconCoord(2, 6);
        BlackBronzeHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackBronzeHoeHead",16528)).setItemName("Black Bronze Hoe Head").setIconCoord(3, 6);
        BlackSteelHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackSteelHoeHead",16529)).setItemName("Black Steel Hoe Head").setIconCoord(4, 6);
        BlueSteelHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlueSteelHoeHead",16530)).setItemName("Blue Steel Hoe Head").setIconCoord(5, 6);
        BronzeHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BronzeHoeHead",16531)).setItemName("Bronze Hoe Head").setIconCoord(6, 6);
        CopperHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","CopperHoeHead",16532)).setItemName("Copper Hoe Head").setIconCoord(7, 6);
        WroughtIronHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","WroughtIronHoeHead",16533)).setItemName("Wrought Iron Hoe Head").setIconCoord(8, 6);
        RedSteelHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RedSteelHoeHead",16534)).setItemName("Red Steel Hoe Head").setIconCoord(9, 6);
        RoseGoldHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RoseGoldHoeHead",16535)).setItemName("Rose Gold Hoe Head").setIconCoord(10, 6);
        SteelHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SteelHoeHead",16536)).setItemName("Steel Hoe Head").setIconCoord(11, 6);
        TinHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","TinHoeHead",16537)).setItemName("Tin Hoe Head").setIconCoord(12, 6);
        ZincHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","ZincHoeHead",16538)).setItemName("Zinc Hoe Head").setIconCoord(13, 6);

        BismuthAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthAxeHead",16539)).setItemName("Bismuth Axe Head").setIconCoord(1, 5);
        BismuthBronzeAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthBronzeAxeHead",16540)).setItemName("Bismuth Bronze Axe Head").setIconCoord(2, 5);
        BlackBronzeAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackBronzeAxeHead",16541)).setItemName("Black Bronze Axe Head").setIconCoord(3, 5);
        BlackSteelAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackSteelAxeHead",16542)).setItemName("Black Steel Axe Head").setIconCoord(4, 5);
        BlueSteelAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlueSteelAxeHead",16543)).setItemName("Blue Steel Axe Head").setIconCoord(5, 5);
        BronzeAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BronzeAxeHead",16544)).setItemName("Bronze Axe Head").setIconCoord(6, 5);
        CopperAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","CopperAxeHead",16545)).setItemName("Copper Axe Head").setIconCoord(7, 5);
        WroughtIronAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","WroughtIronAxeHead",16546)).setItemName("Wrought Iron Axe Head").setIconCoord(8, 5);
        RedSteelAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RedSteelAxeHead",16547)).setItemName("Red Steel Axe Head").setIconCoord(9, 5);
        RoseGoldAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RoseGoldAxeHead",16548)).setItemName("Rose Gold Axe Head").setIconCoord(10, 5);
        SteelAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SteelAxeHead",16549)).setItemName("Steel Axe Head").setIconCoord(11, 5);
        TinAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","TinAxeHead",16550)).setItemName("Tin Axe Head").setIconCoord(12, 5);
        ZincAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","ZincAxeHead",16551)).setItemName("Zinc Axe Head").setIconCoord(13, 5);

        BismuthHammerHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthHammerHead",16552)).setItemName("Bismuth Hammer Head").setIconCoord(1, 11);
        BismuthBronzeHammerHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthBronzeHammerHead",16553)).setItemName("Bismuth Bronze Hammer Head").setIconCoord(2, 11);
        BlackBronzeHammerHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackBronzeHammerHead",16554)).setItemName("Black Bronze Hammer Head").setIconCoord(3, 11);
        BlackSteelHammerHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackSteelHammerHead",16555)).setItemName("Black Steel Hammer Head").setIconCoord(4, 11);
        BlueSteelHammerHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlueSteelHammerHead",16556)).setItemName("Blue Steel Hammer Head").setIconCoord(5, 11);
        BronzeHammerHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BronzeHammerHead",16557)).setItemName("Bronze Hammer Head").setIconCoord(6, 11);
        CopperHammerHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","CopperHammerHead",16558)).setItemName("Copper Hammer Head").setIconCoord(7, 11);
        WroughtIronHammerHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","WroughtIronHammerHead",16559)).setItemName("Wrought Iron Hammer Head").setIconCoord(8, 11);
        RedSteelHammerHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RedSteelHammerHead",16560)).setItemName("Red Steel Hammer Head").setIconCoord(9, 11);
        RoseGoldHammerHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RoseGoldHammerHead",16561)).setItemName("Rose Gold Hammer Head").setIconCoord(10, 11);
        SteelHammerHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SteelHammerHead",16562)).setItemName("Steel Hammer Head").setIconCoord(11, 11);
        TinHammerHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","TinHammerHead",16563)).setItemName("Tin Hammer Head").setIconCoord(12, 11);
        ZincHammerHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","ZincHammerHead",16564)).setItemName("Zinc Hammer Head").setIconCoord(13, 11);

        //chisel heads
        BismuthChiselHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthChiselHead",16565)).setItemName("Bismuth Chisel Head").setIconCoord(1, 7);
        BismuthBronzeChiselHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthBronzeChiselHead",16566)).setItemName("Bismuth Bronze Chisel Head").setIconCoord(2, 7);
        BlackBronzeChiselHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackBronzeChiselHead",16567)).setItemName("Black Bronze Chisel Head").setIconCoord(3, 7);
        BlackSteelChiselHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackSteelChiselHead",16568)).setItemName("Black Steel Chisel Head").setIconCoord(4, 7);
        BlueSteelChiselHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlueSteelChiselHead",16569)).setItemName("Blue Steel Chisel Head").setIconCoord(5, 7);
        BronzeChiselHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BronzeChiselHead",16570)).setItemName("Bronze Chisel Head").setIconCoord(6, 7);
        CopperChiselHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","CopperChiselHead",16571)).setItemName("Copper Chisel Head").setIconCoord(7, 7);
        WroughtIronChiselHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","WroughtIronChiselHead",16572)).setItemName("Wrought Iron Chisel Head").setIconCoord(8, 7);
        RedSteelChiselHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RedSteelChiselHead",16573)).setItemName("Red Steel Chisel Head").setIconCoord(9, 7);
        RoseGoldChiselHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RoseGoldChiselHead",16574)).setItemName("Rose Gold Chisel Head").setIconCoord(10, 7);
        SteelChiselHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SteelChiselHead",16575)).setItemName("Steel Chisel Head").setIconCoord(11, 7);
        TinChiselHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","TinChiselHead",16576)).setItemName("Tin Chisel Head").setIconCoord(12, 7);
        ZincChiselHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","ZincChiselHead",16577)).setItemName("Zinc Chisel Head").setIconCoord(13, 7);

        BismuthSwordHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthSwordHead",16578)).setItemName("Bismuth Sword Blade").setIconCoord(1, 13);
        BismuthBronzeSwordHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthBronzeSwordHead",16579)).setItemName("Bismuth Bronze Sword Blade").setIconCoord(2, 13);
        BlackBronzeSwordHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackBronzeSwordHead",16580)).setItemName("Black Bronze Sword Blade").setIconCoord(3, 13);
        BlackSteelSwordHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackSteelSwordHead",16581)).setItemName("Black Steel Sword Blade").setIconCoord(4, 13);
        BlueSteelSwordHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlueSteelSwordHead",16582)).setItemName("Blue Steel Sword Blade").setIconCoord(5, 13);
        BronzeSwordHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BronzeSwordHead",16583)).setItemName("Bronze Sword Blade").setIconCoord(6, 13);
        CopperSwordHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","CopperSwordHead",16584)).setItemName("Copper Sword Blade").setIconCoord(7, 13);
        WroughtIronSwordHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","WroughtIronSwordHead",16585)).setItemName("Wrought Iron Sword Blade").setIconCoord(8, 13);
        RedSteelSwordHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RedSteelSwordHead",16586)).setItemName("Red Steel Sword Blade").setIconCoord(9, 13);
        RoseGoldSwordHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RoseGoldSwordHead",16587)).setItemName("Rose Gold Sword Blade").setIconCoord(10, 13);
        SteelSwordHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SteelSwordHead",16588)).setItemName("Steel Sword Blade").setIconCoord(11, 13);
        TinSwordHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","TinSwordHead",16589)).setItemName("Tin Sword Blade").setIconCoord(12, 13);
        ZincSwordHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","ZincSwordHead",16590)).setItemName("Zinc Sword Blade").setIconCoord(13, 13);

        BismuthMaceHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthMaceHead",16591)).setItemName("Bismuth Mace Head").setIconCoord(1, 12);
        BismuthBronzeMaceHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthBronzeMaceHead",16592)).setItemName("Bismuth Bronze Mace Head").setIconCoord(2, 12);
        BlackBronzeMaceHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackBronzeMaceHead",16593)).setItemName("Black Bronze Mace Head").setIconCoord(3, 12);
        BlackSteelMaceHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackSteelMaceHead",16594)).setItemName("Black Steel Mace Head").setIconCoord(4, 12);
        BlueSteelMaceHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlueSteelMaceHead",16595)).setItemName("Blue Steel Mace Head").setIconCoord(5, 12);
        BronzeMaceHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BronzeMaceHead",16596)).setItemName("Bronze Mace Head").setIconCoord(6, 12);
        CopperMaceHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","CopperMaceHead",16597)).setItemName("Copper Mace Head").setIconCoord(7, 12);
        WroughtIronMaceHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","WroughtIronMaceHead",16598)).setItemName("Wrought Iron Mace Head").setIconCoord(8, 12);
        RedSteelMaceHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RedSteelMaceHead",16599)).setItemName("Red Steel Mace Head").setIconCoord(9, 12);
        RoseGoldMaceHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RoseGoldMaceHead",16600)).setItemName("Rose Gold Mace Head").setIconCoord(10, 12);
        SteelMaceHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SteelMaceHead",16601)).setItemName("Steel Mace Head").setIconCoord(11, 12);
        TinMaceHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","TinMaceHead",16602)).setItemName("Tin Mace Head").setIconCoord(12, 12);
        ZincMaceHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","ZincMaceHead",16603)).setItemName("Zinc Mace Head").setIconCoord(13, 12);

        BismuthSawHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthSawHead",16604)).setItemName("Bismuth Saw Blade").setIconCoord(1, 8);
        BismuthBronzeSawHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthBronzeSawHead",16605)).setItemName("Bismuth Bronze Saw Blade").setIconCoord(2, 8);
        BlackBronzeSawHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackBronzeSawHead",16606)).setItemName("Black Bronze Saw Blade").setIconCoord(3, 8);
        BlackSteelSawHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackSteelSawHead",16607)).setItemName("Black Steel Saw Blade").setIconCoord(4, 8);
        BlueSteelSawHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlueSteelSawHead",16608)).setItemName("Blue Steel Saw Blade").setIconCoord(5, 8);
        BronzeSawHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BronzeSawHead",16609)).setItemName("Bronze Saw Blade").setIconCoord(6, 8);
        CopperSawHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","CopperSawHead",16610)).setItemName("Copper Saw Blade").setIconCoord(7, 8);
        WroughtIronSawHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","WroughtIronSawHead",16611)).setItemName("Wrought Iron Saw Blade").setIconCoord(8, 8);
        RedSteelSawHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RedSteelSawHead",16612)).setItemName("Red Steel Saw Blade").setIconCoord(9, 8);
        RoseGoldSawHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RoseGoldSawHead",16613)).setItemName("Rose Gold Saw Blade").setIconCoord(10, 8);
        SteelSawHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SteelSawHead",16614)).setItemName("Steel Saw Blade").setIconCoord(11, 8);
        TinSawHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","TinSawHead",16615)).setItemName("Tin Saw Blade").setIconCoord(12, 8);
        ZincSawHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","ZincSawHead",16616)).setItemName("Zinc Saw Blade").setIconCoord(13, 8);
        
        HCBlackSteelUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedHCBlackSteel",16617)).setItemName("UnshapedHCBlackSteel").setIconCoord(3, 9);
        WeakBlueSteelUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedWeakBlueSteel",16618)).setItemName("UnshapedWeakBlueSteel").setIconCoord(4, 9);
        HCBlueSteelUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedHCBlueSteel",16619)).setItemName("UnshapedHCBlueSteel").setIconCoord(4, 9);
        WeakRedSteelUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedWeakRedSteel",16621)).setItemName("UnshapedWeakRedSteel").setIconCoord(3, 10);
        HCRedSteelUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedHCRedSteel",16622)).setItemName("UnshapedHCRedSteel").setIconCoord(3, 10);
        WeakSteelUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedWeakSteel",16623)).setItemName("UnshapedWeakSteel").setIconCoord(6, 10);
        HCSteelUnshaped = new ItemTerraMeltedMetal(TFCSettings.getIntFor(config,"item","UnshapedHCSteel",16624)).setItemName("UnshapedHCSteel").setIconCoord(6, 10);
        Coke = ((ItemTerra) new ItemTerra(TFCSettings.getIntFor(config,"item","Coke",16625)).setItemName("coke").setIconCoord(2, 0)).setTexturePath("/bioxx/terrasprites.png");

        BismuthProPickHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthProPickHead",16626)).setItemName("Bismuth ProPick Head").setIconCoord(1, 1);
        BismuthBronzeProPickHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthBronzeProPickHead",16627)).setItemName("Bismuth Bronze ProPick Head").setIconCoord(2, 1);
        BlackBronzeProPickHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackBronzeProPickHead",16628)).setItemName("Black Bronze ProPick Head").setIconCoord(3, 1);
        BlackSteelProPickHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackSteelProPickHead",16629)).setItemName("Black Steel ProPick Head").setIconCoord(4, 1);
        BlueSteelProPickHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlueSteelProPickHead",16630)).setItemName("Blue Steel ProPick Head").setIconCoord(5, 1);
        BronzeProPickHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BronzeProPickHead",16631)).setItemName("Bronze ProPick Head").setIconCoord(6, 1);
        CopperProPickHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","CopperProPickHead",16632)).setItemName("Copper ProPick Head").setIconCoord(7, 1);
        WroughtIronProPickHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","WroughtIronProPickHead",16633)).setItemName("Wrought Iron ProPick Head").setIconCoord(8, 1);
        RedSteelProPickHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RedSteelProPickHead",16634)).setItemName("Red Steel ProPick Head").setIconCoord(9, 1);
        RoseGoldProPickHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RoseGoldProPickHead",16635)).setItemName("Rose Gold ProPick Head").setIconCoord(10, 1);
        SteelProPickHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SteelProPickHead",16636)).setItemName("Steel ProPick Head").setIconCoord(11, 1);
        TinProPickHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","TinProPickHead",16637)).setItemName("Tin ProPick Head").setIconCoord(12, 1);
        ZincProPickHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","ZincProPickHead",16638)).setItemName("Zinc ProPick Head").setIconCoord(13, 1);
        
        Flux = ((ItemTerra) new ItemTerra(TFCSettings.getIntFor(config,"item","Flux",16639)).setItemName("flux").setIconCoord(0, 0)).setTexturePath("/bioxx/terrasprites.png");
        terraBismuthBronzeAnvilItem = new ItemTerraAnvil(TFCSettings.getIntFor(config,"item","terraBismuthBronzeAnvilItem",16640), 0, AnvilReq.BISMUTHBRONZE).setItemName("terraBismuthBronzeAnvilItem").setIconCoord(2, 2);
        terraBlackBronzeAnvilItem = new ItemTerraAnvil(TFCSettings.getIntFor(config,"item","terraBlackBronzeAnvilItem",16641), 1, AnvilReq.BLACKBRONZE).setItemName("terraBlackBronzeAnvilItem").setIconCoord(3, 2);
        terraRoseGoldAnvilItem = new ItemTerraAnvil(TFCSettings.getIntFor(config,"item","terraRoseGoldAnvilItem",16642), 2, AnvilReq.ROSEGOLD).setItemName("terraRoseGoldAnvilItem").setIconCoord(10, 2);

        /**
         * Scythe
         * */
        int num = 16643;
        BismuthScythe = new ItemCustomScythe(TFCSettings.getIntFor(config,"item","BismuthScythe",num),BismuthToolMaterial).setItemName("Bismuth Scythe").setMaxDamage(BismuthUses).setIconCoord(1, 9);num++;
        BismuthBronzeScythe = new ItemCustomScythe(TFCSettings.getIntFor(config,"item","BismuthBronzeScythe",num),BismuthBronzeToolMaterial).setItemName("Bismuth Bronze Scythe").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 9);num++;
        BlackBronzeScythe = new ItemCustomScythe(TFCSettings.getIntFor(config,"item","BlackBronzeScythe",num),BlackBronzeToolMaterial).setItemName("Black Bronze Scythe").setMaxDamage(BlackBronzeUses).setIconCoord(3, 9);num++;
        BlackSteelScythe = new ItemCustomScythe(TFCSettings.getIntFor(config,"item","BlackSteelScythe",num),BlackSteelToolMaterial).setItemName("Black Steel Scythe").setMaxDamage(BlackSteelUses).setIconCoord(4, 9);num++;
        BlueSteelScythe = new ItemCustomScythe(TFCSettings.getIntFor(config,"item","BlueSteelScythe",num),BlueSteelToolMaterial).setItemName("Blue Steel Scythe").setMaxDamage(BlueSteelUses).setIconCoord(5, 9);num++;
        BronzeScythe = new ItemCustomScythe(TFCSettings.getIntFor(config,"item","BronzeScythe",num),BronzeToolMaterial).setItemName("Bronze Scythe").setMaxDamage(BronzeUses).setIconCoord(6, 9);num++;
        CopperScythe = new ItemCustomScythe(TFCSettings.getIntFor(config,"item","CopperScythe",num),CopperToolMaterial).setItemName("Copper Scythe").setMaxDamage(CopperUses).setIconCoord(7, 9);num++;
        WroughtIronScythe = new ItemCustomScythe(TFCSettings.getIntFor(config,"item","WroughtIronScythe",num),IronToolMaterial).setItemName("Wrought Iron Scythe").setMaxDamage(WroughtIronUses).setIconCoord(8, 9);num++;
        RedSteelScythe = new ItemCustomScythe(TFCSettings.getIntFor(config,"item","RedSteelScythe",num),RedSteelToolMaterial).setItemName("Red Steel Scythe").setMaxDamage(RedSteelUses).setIconCoord(9, 9);num++;
        RoseGoldScythe = new ItemCustomScythe(TFCSettings.getIntFor(config,"item","RoseGoldScythe",num),RoseGoldToolMaterial).setItemName("Rose Gold Scythe").setMaxDamage(RoseGoldUses).setIconCoord(10, 9);num++;
        SteelScythe = new ItemCustomScythe(TFCSettings.getIntFor(config,"item","SteelScythe",num),SteelToolMaterial).setItemName("Steel Scythe").setMaxDamage(SteelUses).setIconCoord(11, 9);num++;
        TinScythe = new ItemCustomScythe(TFCSettings.getIntFor(config,"item","TinScythe",num),TinToolMaterial).setItemName("Tin Scythe").setMaxDamage(TinUses).setIconCoord(12, 9);num++;
        ZincScythe = new ItemCustomScythe(TFCSettings.getIntFor(config,"item","ZincScythe",num),ZincToolMaterial).setItemName("Zinc Scythe").setMaxDamage(ZincUses).setIconCoord(13, 9);num++;
        
        BismuthScytheHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthScytheHead",num)).setItemName("Bismuth Scythe Blade").setIconCoord(1, 9);num++;
        BismuthBronzeScytheHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthBronzeScytheHead",num)).setItemName("Bismuth Bronze Scythe Blade").setIconCoord(2, 9);num++;
        BlackBronzeScytheHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackBronzeScytheHead",num)).setItemName("Black Bronze Scythe Blade").setIconCoord(3, 9);num++;
        BlackSteelScytheHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackSteelScytheHead",num)).setItemName("Black Steel Scythe Blade").setIconCoord(4, 9);num++;
        BlueSteelScytheHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlueSteelScytheHead",num)).setItemName("Blue Steel Scythe Blade").setIconCoord(5, 9);num++;
        BronzeScytheHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BronzeScytheHead",num)).setItemName("Bronze Scythe Blade").setIconCoord(6, 9);num++;
        CopperScytheHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","CopperScytheHead",num)).setItemName("Copper Scythe Blade").setIconCoord(7, 9);num++;
        WroughtIronScytheHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","WroughtIronScytheHead",num)).setItemName("Wrought Iron Scythe Blade").setIconCoord(8, 9);num++;
        RedSteelScytheHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RedSteelScytheHead",num)).setItemName("Red Steel Scythe Blade").setIconCoord(9, 9);num++;
        RoseGoldScytheHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RoseGoldScytheHead",num)).setItemName("Rose Gold Scythe Blade").setIconCoord(10, 9);num++;
        SteelScytheHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SteelScytheHead",num)).setItemName("Steel Scythe Blade").setIconCoord(11, 9);num++;
        TinScytheHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","TinScytheHead",num)).setItemName("Tin Scythe Blade").setIconCoord(12, 9);num++;
        ZincScytheHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","ZincScytheHead",num)).setItemName("Zinc Scythe Blade").setIconCoord(13, 9);num++;

        /**Plans*/
        PickaxeHeadPlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","PickaxeHeadPlan",num)).setItemName("PickaxeHeadPlan").setIconCoord(0, 0);num++;
        ShovelHeadPlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","ShovelHeadPlan",num)).setItemName("ShovelHeadPlan").setIconCoord(0, 0);num++;
        HoeHeadPlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","HoeHeadPlan",num)).setItemName("HoeHeadPlan").setIconCoord(0, 0);num++;
        AxeHeadPlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","AxeHeadPlan",num)).setItemName("AxeHeadPlan").setIconCoord(0, 0);num++;
        HammerHeadPlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","HammerHeadPlan",num)).setItemName("HammerHeadPlan").setIconCoord(0, 0);num++;
        ChiselHeadPlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","ChiselHeadPlan",num)).setItemName("ChiselHeadPlan").setIconCoord(0, 0);num++;
        SwordBladePlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","SwordBladePlan",num)).setItemName("SwordBladePlan").setIconCoord(0, 0);num++;
        MaceHeadPlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","MaceHeadPlan",num)).setItemName("MaceHeadPlan").setIconCoord(0, 0);num++;
        SawBladePlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","SawBladePlan",num)).setItemName("SawBladePlan").setIconCoord(0, 0);num++;
        ProPickHeadPlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","ProPickHeadPlan",num)).setItemName("ProPickHeadPlan").setIconCoord(0, 0);num++;
        HelmetPlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","HelmetPlan",num)).setItemName("HelmetPlan").setIconCoord(0, 0);num++;
        ChestplatePlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","ChestplatePlan",num)).setItemName("ChestplatePlan").setIconCoord(0, 0);num++;
        GreavesPlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","GreavesPlan",num)).setItemName("GreavesPlan").setIconCoord(0, 0);num++;
        BootsPlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","BootsPlan",num)).setItemName("BootsPlan").setIconCoord(0, 0);num++;
        ScythePlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","ScythePlan",num)).setItemName("ScythePlan").setIconCoord(0, 0);num++;
        KnifePlan = new ItemTerraMiscTool(TFCSettings.getIntFor(config,"item","KnifePlan",num)).setItemName("KnifePlan").setIconCoord(0, 0);num++;
        
        WoodenBucketEmpty = (new ItemCustomBucket(TFCSettings.getIntFor(config,"item","WoodenBucketEmpty",num), 0)).setIconCoord(13, 0).setItemName("WoodenBucketEmpty");num++;
        WoodenBucketWater = (new ItemCustomBucket(TFCSettings.getIntFor(config,"item","WoodenBucketWater",num), mod_TFC_Core.finiteWater.blockID)).setIconCoord(14, 0).setItemName("WoodenBucketWater").setContainerItem(WoodenBucketEmpty);num++;
        WoodenBucketMilk = (new ItemCustomBucketMilk(TFCSettings.getIntFor(config,"item","WoodenBucketMilk",num))).setIconCoord(15, 0).setItemName("WoodenBucketMilk").setContainerItem(WoodenBucketEmpty);num++;
        
        BismuthKnifeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthKnifeHead",num)).setItemName("Bismuth Knife Blade").setIconCoord(1, 10);num++;
        BismuthBronzeKnifeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BismuthBronzeKnifeHead",num)).setItemName("Bismuth Bronze Knife Blade").setIconCoord(2, 10);num++;
        BlackBronzeKnifeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackBronzeKnifeHead",num)).setItemName("Black Bronze Knife Blade").setIconCoord(3, 10);num++;
        BlackSteelKnifeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlackSteelKnifeHead",num)).setItemName("Black Steel Knife Blade").setIconCoord(4, 10);num++;
        BlueSteelKnifeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BlueSteelKnifeHead",num)).setItemName("Blue Steel Knife Blade").setIconCoord(5, 10);num++;
        BronzeKnifeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","BronzeKnifeHead",num)).setItemName("Bronze Knife Blade").setIconCoord(6, 10);num++;
        CopperKnifeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","CopperKnifeHead",num)).setItemName("Copper Knife Blade").setIconCoord(7, 10);num++;
        WroughtIronKnifeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","WroughtIronKnifeHead",num)).setItemName("Wrought Iron Knife Blade").setIconCoord(8, 10);num++;
        RedSteelKnifeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RedSteelKnifeHead",num)).setItemName("Red Steel Knife Blade").setIconCoord(9, 10);num++;
        RoseGoldKnifeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","RoseGoldKnifeHead",num)).setItemName("Rose Gold Knife Blade").setIconCoord(10, 10);num++;
        SteelKnifeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SteelKnifeHead",num)).setItemName("Steel Knife Blade").setIconCoord(11, 10);num++;
        TinKnifeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","TinKnifeHead",num)).setItemName("Tin Knife Blade").setIconCoord(12, 10);num++;
        ZincKnifeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","ZincKnifeHead",num)).setItemName("Zinc Knife Blade").setIconCoord(13, 10);num++;
        
        BismuthKnife = new ItemCustomKnife(TFCSettings.getIntFor(config,"item","BismuthKnife",num),BismuthToolMaterial).setItemName("Bismuth Knife").setMaxDamage(BismuthUses).setIconCoord(1, 10);num++;
        BismuthBronzeKnife = new ItemCustomKnife(TFCSettings.getIntFor(config,"item","BismuthBronzeKnife",num),BismuthBronzeToolMaterial).setItemName("Bismuth Bronze Knife").setMaxDamage(BismuthBronzeUses).setIconCoord(2, 10);num++;
        BlackBronzeKnife = new ItemCustomKnife(TFCSettings.getIntFor(config,"item","BlackBronzeKnife",num),BlackBronzeToolMaterial).setItemName("Black Bronze Knife").setMaxDamage(BlackBronzeUses).setIconCoord(3, 10);num++;
        BlackSteelKnife = new ItemCustomKnife(TFCSettings.getIntFor(config,"item","BlackSteelKnife",num),BlackSteelToolMaterial).setItemName("Black Steel Knife").setMaxDamage(BlackSteelUses).setIconCoord(4, 10);num++;
        BlueSteelKnife = new ItemCustomKnife(TFCSettings.getIntFor(config,"item","BlueSteelKnife",num),BlueSteelToolMaterial).setItemName("Blue Steel Knife").setMaxDamage(BlueSteelUses).setIconCoord(5, 10);num++;
        BronzeKnife = new ItemCustomKnife(TFCSettings.getIntFor(config,"item","BronzeKnife",num),BronzeToolMaterial).setItemName("Bronze Knife").setMaxDamage(BronzeUses).setIconCoord(6, 10);num++;
        CopperKnife = new ItemCustomKnife(TFCSettings.getIntFor(config,"item","CopperKnife",num),CopperToolMaterial).setItemName("Copper Knife").setMaxDamage(CopperUses).setIconCoord(7, 10);num++;
        WroughtIronKnife = new ItemCustomKnife(TFCSettings.getIntFor(config,"item","WroughtIronKnife",num),IronToolMaterial).setItemName("Wrought Iron Knife").setMaxDamage(WroughtIronUses).setIconCoord(8, 10);num++;
        RedSteelKnife = new ItemCustomKnife(TFCSettings.getIntFor(config,"item","RedSteelKnife",num),RedSteelToolMaterial).setItemName("Red Steel Knife").setMaxDamage(RedSteelUses).setIconCoord(9, 10);num++;
        RoseGoldKnife = new ItemCustomKnife(TFCSettings.getIntFor(config,"item","RoseGoldKnife",num),RoseGoldToolMaterial).setItemName("Rose Gold Knife").setMaxDamage(RoseGoldUses).setIconCoord(10, 10);num++;
        SteelKnife = new ItemCustomKnife(TFCSettings.getIntFor(config,"item","SteelKnife",num),SteelToolMaterial).setItemName("Steel Knife").setMaxDamage(SteelUses).setIconCoord(11, 10);num++;
        TinKnife = new ItemCustomKnife(TFCSettings.getIntFor(config,"item","TinKnife",num),TinToolMaterial).setItemName("Tin Knife").setMaxDamage(TinUses).setIconCoord(12, 10);num++;
        ZincKnife = new ItemCustomKnife(TFCSettings.getIntFor(config,"item","ZincKnife",num),ZincToolMaterial).setItemName("Zinc Knife").setMaxDamage(ZincUses).setIconCoord(13, 10);num++;
        
        LooseRock = ((ItemTerra) new ItemLooseRock(TFCSettings.getIntFor(config,"item","LooseRock",num)).setItemName("LooseRock")).setTexturePath("/bioxx/terraRock.png");num++;
        FlatRock = ((ItemTerra) new ItemFlatRock(TFCSettings.getIntFor(config,"item","FlatRock",num)).setItemName("FlatRock")).setTexturePath("/bioxx/terraRock.png");num++;
        
        IgInStonePickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","IgInStonePickaxeHead",num)).setItemName("Stone Pickaxe Head").setIconCoord(0, 3);num++;
        SedStonePickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SedStonePickaxeHead",num)).setItemName("Stone Pickaxe Head").setIconCoord(0, 3);num++;
        IgExStonePickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","IgExStonePickaxeHead",num)).setItemName("Stone Pickaxe Head").setIconCoord(0, 3);num++;
        MMStonePickaxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","MMStonePickaxeHead",num)).setItemName("Stone Pickaxe Head").setIconCoord(0, 3);num++;
        
        IgInStoneShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","IgInStoneShovelHead",num)).setItemName("Stone Shovel Head").setIconCoord(0, 4);num++;
        SedStoneShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SedStoneShovelHead",num)).setItemName("Stone Shovel Head").setIconCoord(0, 4);num++;
        IgExStoneShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","IgExStoneShovelHead",num)).setItemName("Stone Shovel Head").setIconCoord(0, 4);num++;
        MMStoneShovelHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","MMStoneShovelHead",num)).setItemName("Stone Shovel Head").setIconCoord(0, 4);num++;
        
        IgInStoneAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","IgInStoneAxeHead",num)).setItemName("Stone Axe Head").setIconCoord(0, 5);num++;
        SedStoneAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SedStoneAxeHead",num)).setItemName("Stone Axe Head").setIconCoord(0, 5);num++;
        IgExStoneAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","IgExStoneAxeHead",num)).setItemName("Stone Axe Head").setIconCoord(0, 5);num++;
        MMStoneAxeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","MMStoneAxeHead",num)).setItemName("Stone Axe Head").setIconCoord(0, 5);num++;
        
        IgInStoneHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","IgInStoneHoeHead",num)).setItemName("Stone Hoe Head").setIconCoord(0, 6);num++;
        SedStoneHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","SedStoneHoeHead",num)).setItemName("Stone Hoe Head").setIconCoord(0, 6);num++;
        IgExStoneHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","IgExStoneHoeHead",num)).setItemName("Stone Hoe Head").setIconCoord(0, 6);num++;
        MMStoneHoeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","MMStoneHoeHead",num)).setItemName("Stone Hoe Head").setIconCoord(0, 6);num++;
        
        StoneKnifeHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","StoneKnifeHead",num)).setItemName("Stone Knife Blade").setIconCoord(0, 10);num++;
        StoneHammerHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","StoneHammerHead",num)).setItemName("Stone Hammer Head").setIconCoord(0, 11);num++;
        StoneProPickHead = new ItemTerraMiscToolHead(TFCSettings.getIntFor(config,"item","StoneProPickHead",num)).setItemName("Stone ProPick Head").setIconCoord(0, 1);num++;
        
        StoneKnife = new ItemCustomKnife(TFCSettings.getIntFor(config,"item","StoneKnife",num),IgExToolMaterial).setItemName("Stone Knife").setMaxDamage(IgExStoneUses).setIconCoord(0, 10);num++;
        SmallOreChunk = new ItemTerraOreSmall(TFCSettings.getIntFor(config,"item","SmallOreChunk",num++)).setItemName("Small Ore").setIconCoord(0, 14);
        SinglePlank = new ItemPlank(TFCSettings.getIntFor(config,"item","SinglePlank",num++),"/bioxx/terrasprites2.png").setItemName("SinglePlank").setIconCoord(0, 6);
        
        
        Item.itemsList[Item.stick.shiftedIndex] = null; Item.itemsList[Item.stick.shiftedIndex] = new ItemStick(24).setIconCoord(5, 3).setFull3D().setItemName("Stick");
        /**Food Items*/
        Item.itemsList[63+256] = null; Item.itemsList[63+256] = new ItemTerraFood(63, 3, 0.3F, true,"/gui/items.png").setIconCoord(7, 5).setItemName("porkchopRaw");
        Item.itemsList[64+256] = null; Item.itemsList[64+256] = new ItemTerraFood(64, 8, 0.8F, true,"/gui/items.png").setIconCoord(8, 5).setItemName("porkchopCooked");
        Item.itemsList[93+256] = null; Item.itemsList[93+256] = new ItemTerraFood(93, 2, 0.3F, true,"/gui/items.png").setIconCoord(9, 5).setItemName("fishRaw");
        Item.itemsList[94+256] = null; Item.itemsList[94+256] = new ItemTerraFood(94, 5, 0.6F, true,"/gui/items.png").setIconCoord(10, 5).setItemName("fishCooked");
        Item.itemsList[107+256] = null; Item.itemsList[107+256] = new ItemTerraFood(107, 3, 0.3F, true,"/gui/items.png").setIconCoord(9, 6).setItemName("beefRaw");
        Item.itemsList[108+256] = null; Item.itemsList[108+256] = new ItemTerraFood(108, 8, 0.8F, true,"/gui/items.png").setIconCoord(10, 6).setItemName("beefCooked");
        Item.itemsList[109+256] = null; Item.itemsList[109+256] = new ItemTerraFood(109, 2, 0.3F, true,"/gui/items.png").setPotionEffect(Potion.hunger.id, 30, 0, 0.3F).setIconCoord(9, 7).setItemName("chickenRaw");
        Item.itemsList[110+256] = null; Item.itemsList[110+256] = new ItemTerraFood(110, 6, 0.6F, true,"/gui/items.png").setIconCoord(10, 6).setIconCoord(10, 7).setItemName("chickenCooked");
        Item.itemsList[41+256] = null; Item.itemsList[41+256] = (new ItemTerraFood(41, 5, 0.6F, false,"/gui/items.png")).setIconCoord(9, 2).setItemName("bread");
        Item.itemsList[88+256] = null; Item.itemsList[88+256] = (new ItemTerra(88,"/gui/items.png")).setIconCoord(12, 0).setItemName("egg");
        
        num = 18000;
        SeedsWheat = new ItemCustomSeeds(TFCSettings.getIntFor(config,"item","SeedsWheat",num),Block.crops.blockID,mod_TFC_Core.tilledSoil.blockID,mod_TFC_Core.tilledSoil2.blockID).setItemName("SeedsWheat").setIconCoord(9, 0);num++;
        FruitTreeSapling1 = new ItemFruitTreeSapling(TFCSettings.getIntFor(config,"item","FruitSapling1", num), "/bioxx/Vegetation.png", 0).setItemName("FruitSapling1").setIconCoord(0, 7);num++;
        FruitTreeSapling2 = new ItemFruitTreeSapling(TFCSettings.getIntFor(config,"item","FruitSapling2", num), "/bioxx/Vegetation.png", 8).setItemName("FruitSapling2").setIconCoord(8, 7);num++;
        RedApple = new ItemTerraFood(TFCSettings.getIntFor(config,"item","Fruit.Red Apple",num), 3, 0.1F, false,"/bioxx/FoodSprites.png").setIconCoord(2, 0).setItemName("Fruit.Red Apple");num++;
        Banana = new ItemTerraFood(TFCSettings.getIntFor(config,"item","Fruit.Banana",num), 3, 0.1F, false,"/bioxx/FoodSprites.png").setIconCoord(0, 0).setItemName("Fruit.Banana");num++;
        Orange = new ItemTerraFood(TFCSettings.getIntFor(config,"item","Fruit.Orange",num), 3, 0.1F, false,"/bioxx/FoodSprites.png").setIconCoord(1, 0).setItemName("Fruit.Orange");num++;
        GreenApple = new ItemTerraFood(TFCSettings.getIntFor(config,"item","Fruit.Green Apple",num), 3, 0.1F, false,"/bioxx/FoodSprites.png").setIconCoord(3, 0).setItemName("Fruit.Green Apple");num++;
        Lemon = new ItemTerraFood(TFCSettings.getIntFor(config,"item","Fruit.Lemon",num), 2, 0.03F, false,"/bioxx/FoodSprites.png").setIconCoord(4, 0).setItemName("Fruit.Lemon");num++;
        Olive = new ItemTerraFood(TFCSettings.getIntFor(config,"item","Fruit.Olive",num), 1, 0.05F, false,"/bioxx/FoodSprites.png").setIconCoord(8, 0).setItemName("Fruit.Olive");num++;
        Cherry = new ItemTerraFood(TFCSettings.getIntFor(config,"item","Fruit.Cherry",num), 1, 0.03F, false,"/bioxx/FoodSprites.png").setIconCoord(5, 0).setItemName("Fruit.Cherry");num++;
        Peach = new ItemTerraFood(TFCSettings.getIntFor(config,"item","Fruit.Peach",num), 3, 0.1F, false,"/bioxx/FoodSprites.png").setIconCoord(6, 0).setItemName("Fruit.Peach");num++;
        Plum = new ItemTerraFood(TFCSettings.getIntFor(config,"item","Fruit.Plum",num), 2, 0.1F, false,"/bioxx/FoodSprites.png").setIconCoord(7, 0).setItemName("Fruit.Plum");num++;
        EggCooked = new ItemTerraFood(TFCSettings.getIntFor(config,"item","Meat.EggCooked",num), 4, 0.4F, false,"/bioxx/FoodSprites.png").setIconCoord(0, 7).setItemName("Meat.EggCooked");num++;
        
        
        /**Armor Crafting related items*/
        num = 19000;
        BismuthSheet = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","BismuthSheet",num)).setItemName("BismuthSheet").setIconCoord(5,14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        BismuthBronzeSheet = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","Bismuth BronzeSheet",num)).setItemName("Bismuth BronzeSheet").setIconCoord(6, 14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        BlackBronzeSheet = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","Black BronzeSheet",num)).setItemName("Black BronzeSheet").setIconCoord(7, 14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        BlackSteelSheet = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","Black SteelSheet",num)).setItemName("Black SteelSheet").setIconCoord(8, 14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        BlueSteelSheet = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","Blue SteelSheet",num)).setItemName("Blue SteelSheet").setIconCoord(9, 14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        BronzeSheet = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","BronzeSheet",num)).setItemName("BronzeSheet").setIconCoord(11, 14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        CopperSheet = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","CopperSheet",num)).setItemName("CopperSheet").setIconCoord(12, 14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        WroughtIronSheet = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","Wrought IronSheet",num)).setItemName("Wrought IronSheet").setIconCoord(14, 14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        RedSteelSheet = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","Red SteelSheet",num)).setItemName("Red SteelSheet").setIconCoord(8, 15)).setTexturePath("/bioxx/terraarmor1.png");num++;
        RoseGoldSheet = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","Rose GoldSheet",num)).setItemName("Rose GoldSheet").setIconCoord(9, 15)).setTexturePath("/bioxx/terraarmor1.png");num++;
        SteelSheet = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","SteelSheet",num)).setItemName("SteelSheet").setIconCoord(11, 15)).setTexturePath("/bioxx/terraarmor1.png");num++;
        TinSheet = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","TinSheet",num)).setItemName("TinSheet").setIconCoord(13, 15)).setTexturePath("/bioxx/terraarmor1.png");num++;
        ZincSheet = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","ZincSheet",num)).setItemName("ZincSheet").setIconCoord(14, 15)).setTexturePath("/bioxx/terraarmor1.png");num++;
        
        BismuthSheet2x = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","BismuthSheet2x",num)).setItemName("BismuthSheet2x").setIconCoord(5,14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        BismuthBronzeSheet2x = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","Bismuth BronzeSheet2x",num)).setItemName("Bismuth BronzeSheet2x").setIconCoord(6, 14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        BlackBronzeSheet2x = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","Black BronzeSheet2x",num)).setItemName("Black BronzeSheet2x").setIconCoord(7, 14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        BlackSteelSheet2x = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","Black SteelSheet2x",num)).setItemName("Black SteelSheet2x").setIconCoord(8, 14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        BlueSteelSheet2x = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","Blue SteelSheet2x",num)).setItemName("Blue SteelSheet2x").setIconCoord(9, 14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        BronzeSheet2x = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","BronzeSheet2x",num)).setItemName("BronzeSheet2x").setIconCoord(11, 14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        CopperSheet2x = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","CopperSheet2x",num)).setItemName("CopperSheet2x").setIconCoord(12, 14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        WroughtIronSheet2x = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","Wrought IronSheet2x",num)).setItemName("Wrought IronSheet2x").setIconCoord(14, 14)).setTexturePath("/bioxx/terraarmor1.png");num++;
        RedSteelSheet2x = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","Red SteelSheet2x",num)).setItemName("Red SteelSheet2x").setIconCoord(8, 15)).setTexturePath("/bioxx/terraarmor1.png");num++;
        RoseGoldSheet2x = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","Rose GoldSheet2x",num)).setItemName("Rose GoldSheet2x").setIconCoord(9, 15)).setTexturePath("/bioxx/terraarmor1.png");num++;
        SteelSheet2x = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","SteelSheet2x",num)).setItemName("SteelSheet2x").setIconCoord(11, 15)).setTexturePath("/bioxx/terraarmor1.png");num++;
        TinSheet2x = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","TinSheet2x",num)).setItemName("TinSheet2x").setIconCoord(13, 15)).setTexturePath("/bioxx/terraarmor1.png");num++;
        ZincSheet2x = ((ItemTerra)new ItemTerra(TFCSettings.getIntFor(config,"item","ZincSheet2x",num)).setItemName("ZincSheet2x").setIconCoord(14, 15)).setTexturePath("/bioxx/terraarmor1.png");num++;
        
        
        MeltedMetal = new Item[]{BismuthUnshaped, BismuthBronzeUnshaped,BlackBronzeUnshaped,
            TFCItems.BlackSteelUnshaped,TFCItems.BlueSteelUnshaped,TFCItems.BrassUnshaped,TFCItems.BronzeUnshaped,
            TFCItems.CopperUnshaped,TFCItems.GoldUnshaped,
            TFCItems.WroughtIronUnshaped,TFCItems.LeadUnshaped,TFCItems.NickelUnshaped,TFCItems.PigIronUnshaped,
            TFCItems.PlatinumUnshaped,TFCItems.RedSteelUnshaped,TFCItems.RoseGoldUnshaped,TFCItems.SilverUnshaped,
            TFCItems.SteelUnshaped,TFCItems.SterlingSilverUnshaped,
            TFCItems.TinUnshaped,TFCItems.ZincUnshaped, TFCItems.HCSteelUnshaped, TFCItems.WeakSteelUnshaped,
            TFCItems.HCBlackSteelUnshaped, TFCItems.HCBlueSteelUnshaped, TFCItems.HCRedSteelUnshaped, 
            TFCItems.WeakBlueSteelUnshaped, TFCItems.WeakRedSteelUnshaped};
        
        Hammers  = new Item[]{TFCItems.BismuthHammer,TFCItems.BismuthBronzeHammer,TFCItems.BlackBronzeHammer,
            TFCItems.BlackSteelHammer,TFCItems.BlueSteelHammer,TFCItems.BronzeHammer,TFCItems.CopperHammer,
            TFCItems.WroughtIronHammer,TFCItems.RedSteelHammer,TFCItems.RoseGoldHammer,TFCItems.SteelHammer,
            TFCItems.TinHammer,TFCItems.ZincHammer};
        
        String[] Names = {"Bismuth", "Bismuth Bronze", "Black Bronze", "Black Steel", "Blue Steel", "Bronze", "Copper", "Wrought Iron", "Red Steel", "Rose Gold", "Steel", "Tin", "Zinc"};
        IProxy proxy = ServerClientProxy.getProxy();
        
        EnumArmorMaterial[] mats = new EnumArmorMaterial[]{mod_TFC_Core.BismuthArmorMaterial,mod_TFC_Core.BismuthBronzeArmorMaterial,mod_TFC_Core.BlackBronzeArmorMaterial,mod_TFC_Core.BlackSteelArmorMaterial,mod_TFC_Core.BlueSteelArmorMaterial,
                mod_TFC_Core.BronzeArmorMaterial,mod_TFC_Core.CopperArmorMaterial,mod_TFC_Core.IronArmorMaterial,mod_TFC_Core.RedSteelArmorMaterial,mod_TFC_Core.RoseGoldArmorMaterial,
                mod_TFC_Core.SteelArmorMaterial,mod_TFC_Core.TinArmorMaterial,mod_TFC_Core.ZincArmorMaterial};
        
        
        int i = 0;
        TFCItems.BismuthUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedBoots",num)).setItemName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BismuthBronzeUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedBoots",num)).setItemName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackBronzeUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedBoots",num)).setItemName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackSteelUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedBoots",num)).setItemName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlueSteelUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedBoots",num)).setItemName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BronzeUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedBoots",num)).setItemName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.CopperUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedBoots",num)).setItemName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.WroughtIronUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedBoots",num)).setItemName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RedSteelUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedBoots",num)).setItemName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RoseGoldUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedBoots",num)).setItemName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.SteelUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedBoots",num)).setItemName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.TinUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedBoots",num)).setItemName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.ZincUnfinishedBoots = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedBoots",num)).setItemName(Names[i]+"UnfinishedBoots").setIconCoord(1+i,3)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        i = 0;
        TFCItems.BismuthBoots = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setItemName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.BismuthBronzeBoots = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setItemName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.BlackBronzeBoots = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setItemName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.BlackSteelBoots = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setItemName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.BlueSteelBoots = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setItemName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.BronzeBoots = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setItemName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.CopperBoots = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setItemName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.WroughtIronBoots = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setItemName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.RedSteelBoots = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setItemName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.RoseGoldBoots = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setItemName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.SteelBoots = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setItemName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.TinBoots = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setItemName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        TFCItems.ZincBoots = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Boots",num),mats[i], proxy.getArmorRenderID(i), 3).setItemName(Names[i]+"Boots").setIconCoord(1+i,3)); num++;i++;
        i = 0;
        TFCItems.BismuthUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedGreaves",num)).setItemName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BismuthBronzeUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedGreaves",num)).setItemName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackBronzeUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedGreaves",num)).setItemName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackSteelUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedGreaves",num)).setItemName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlueSteelUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedGreaves",num)).setItemName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BronzeUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedGreaves",num)).setItemName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.CopperUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedGreaves",num)).setItemName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.WroughtIronUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedGreaves",num)).setItemName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RedSteelUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedGreaves",num)).setItemName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RoseGoldUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedGreaves",num)).setItemName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.SteelUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedGreaves",num)).setItemName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.TinUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedGreaves",num)).setItemName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.ZincUnfinishedGreaves = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedGreaves",num)).setItemName(Names[i]+"UnfinishedGreaves").setIconCoord(1+i,2)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        i = 0;
        TFCItems.BismuthGreaves = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setItemName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.BismuthBronzeGreaves = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setItemName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.BlackBronzeGreaves = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setItemName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.BlackSteelGreaves = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setItemName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.BlueSteelGreaves = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setItemName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.BronzeGreaves = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setItemName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.CopperGreaves = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setItemName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.WroughtIronGreaves = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setItemName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.RedSteelGreaves = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setItemName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.RoseGoldGreaves = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setItemName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.SteelGreaves = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setItemName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.TinGreaves = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setItemName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        TFCItems.ZincGreaves = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Greaves",num),mats[i], proxy.getArmorRenderID(i), 2).setItemName(Names[i]+"Greaves").setIconCoord(1+i,2)); num++;i++;
        i = 0;
        TFCItems.BismuthUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedChestplate",num)).setItemName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BismuthBronzeUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedChestplate",num)).setItemName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackBronzeUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedChestplate",num)).setItemName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackSteelUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedChestplate",num)).setItemName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlueSteelUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedChestplate",num)).setItemName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BronzeUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedChestplate",num)).setItemName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.CopperUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedChestplate",num)).setItemName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.WroughtIronUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedChestplate",num)).setItemName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RedSteelUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedChestplate",num)).setItemName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RoseGoldUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedChestplate",num)).setItemName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.SteelUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedChestplate",num)).setItemName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.TinUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedChestplate",num)).setItemName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.ZincUnfinishedChestplate = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedChestplate",num)).setItemName(Names[i]+"UnfinishedChestplate").setIconCoord(1+i,1)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        i = 0;
        TFCItems.BismuthChestplate = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setItemName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.BismuthBronzeChestplate = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setItemName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.BlackBronzeChestplate = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setItemName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.BlackSteelChestplate = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setItemName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.BlueSteelChestplate = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setItemName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.BronzeChestplate = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setItemName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.CopperChestplate = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setItemName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.WroughtIronChestplate = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setItemName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.RedSteelChestplate = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setItemName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.RoseGoldChestplate = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setItemName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.SteelChestplate = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setItemName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.TinChestplate = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setItemName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        TFCItems.ZincChestplate = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Chestplate",num),mats[i], proxy.getArmorRenderID(i), 1).setItemName(Names[i]+"Chestplate").setIconCoord(1+i,1)); num++;i++;
        i = 0;
        TFCItems.BismuthUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedHelmet",num)).setItemName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BismuthBronzeUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedHelmet",num)).setItemName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackBronzeUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedHelmet",num)).setItemName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlackSteelUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedHelmet",num)).setItemName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BlueSteelUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedHelmet",num)).setItemName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.BronzeUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedHelmet",num)).setItemName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.CopperUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedHelmet",num)).setItemName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.WroughtIronUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedHelmet",num)).setItemName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RedSteelUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedHelmet",num)).setItemName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.RoseGoldUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedHelmet",num)).setItemName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.SteelUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedHelmet",num)).setItemName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.TinUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedHelmet",num)).setItemName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        TFCItems.ZincUnfinishedHelmet = ((ItemUnfinishedArmor)new ItemUnfinishedArmor(TFCSettings.getIntFor(config,"item",Names[i]+"UnfinishedHelmet",num)).setItemName(Names[i]+"UnfinishedHelmet").setIconCoord(1+i,0)).setTexturePath("/bioxx/terraarmor1.png"); num++;i++;
        i = 0;
        TFCItems.BismuthHelmet = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setItemName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.BismuthBronzeHelmet = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setItemName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.BlackBronzeHelmet = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setItemName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.BlackSteelHelmet = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setItemName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.BlueSteelHelmet = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setItemName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.BronzeHelmet = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setItemName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.CopperHelmet = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setItemName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.WroughtIronHelmet = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setItemName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.RedSteelHelmet = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setItemName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.RoseGoldHelmet = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setItemName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.SteelHelmet = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setItemName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.TinHelmet = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setItemName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        TFCItems.ZincHelmet = ((ItemTerraArmor)new ItemTerraArmor(TFCSettings.getIntFor(config,"item",Names[i]+"Helmet",num),mats[i], proxy.getArmorRenderID(i), 0).setItemName(Names[i]+"Helmet").setIconCoord(1+i,0)); num++;i++;
        
        


        

        
        TFC_Core.Axes = new Item[]{terraSedAxe,terraIgInAxe,terraIgExAxe,terraMMAxe,
                terraBismuthAxe,terraBismuthBronzeAxe,terraBlackBronzeAxe,
                terraBlackSteelAxe,terraBlueSteelAxe,terraBronzeAxe,terraCopperAxe,
                terraWroughtIronAxe,terraRedSteelAxe,terraRoseGoldAxe,terraSteelAxe,
                terraTinAxe,terraZincAxe,
                boneSedAxe,boneIgInAxe,boneIgExAxe,boneMMAxe};
        
        TFC_Core.Chisels = new Item[]{BismuthChisel,BismuthBronzeChisel,BlackBronzeChisel,
            BlackSteelChisel,BlueSteelChisel,BronzeChisel,CopperChisel,
            WroughtIronChisel,RedSteelChisel,RoseGoldChisel,SteelChisel,
            TinChisel,ZincChisel};
        
        TFC_Core.Saws = new Item[]{BismuthSaw,BismuthBronzeSaw,BlackBronzeSaw,
                BlackSteelSaw,BlueSteelSaw,BronzeSaw,CopperSaw,
                WroughtIronSaw,RedSteelSaw,RoseGoldSaw,SteelSaw,
                TinSaw,ZincSaw};
        
        TFC_Core.Knives = new Item[]{StoneKnife,BismuthKnife,BismuthBronzeKnife,BlackBronzeKnife,
                BlackSteelKnife,BlueSteelKnife,BronzeKnife,CopperKnife,
                WroughtIronKnife,RedSteelKnife,RoseGoldKnife,SteelKnife,
                TinKnife,ZincKnife};
        
        if (config != null) {
            config.save();
        }
    }
}