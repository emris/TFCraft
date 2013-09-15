package TFC.Core;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import TFC.Blocks.Vanilla.BlockCustomRail;

public class RailLogic
{
    private World logicWorld;
    private int railX;
    private int railY;
    private int railZ;
    private final boolean isStraightRail;

    /** The chunk position the rail is at. */
    private List railChunkPosition;

    private final boolean canMakeSlopes;

    final BlockCustomRail theRail;

    public RailLogic(BlockCustomRail par1BlockCustomRail, World par2World, int par3, int par4, int par5)
    {
        this.theRail = par1BlockCustomRail;
        this.railChunkPosition = new ArrayList();
        this.logicWorld = par2World;
        this.railX = par3;
        this.railY = par4;
        this.railZ = par5;
        int l = par2World.getBlockId(par3, par4, par5);

        BlockCustomRail target = (BlockCustomRail)Block.blocksList[l];
        int i1 = target.getBasicRailMetadata(par2World, null, par3, par4, par5);
        isStraightRail = !target.isFlexibleRail(par2World, par3, par4, par5);
        canMakeSlopes = target.canMakeSlopes(par2World, par3, par4, par5);

        this.setBasicRail(i1);
    }

    private void setBasicRail(int par1)
    {
        this.railChunkPosition.clear();

        if (par1 == 0)
        {
            this.railChunkPosition.add(new ChunkPosition(this.railX, this.railY, this.railZ - 1));
            this.railChunkPosition.add(new ChunkPosition(this.railX, this.railY, this.railZ + 1));
        }
        else if (par1 == 1)
        {
            this.railChunkPosition.add(new ChunkPosition(this.railX - 1, this.railY, this.railZ));
            this.railChunkPosition.add(new ChunkPosition(this.railX + 1, this.railY, this.railZ));
        }
        else if (par1 == 2)
        {
            this.railChunkPosition.add(new ChunkPosition(this.railX - 1, this.railY, this.railZ));
            this.railChunkPosition.add(new ChunkPosition(this.railX + 1, this.railY + 1, this.railZ));
        }
        else if (par1 == 3)
        {
            this.railChunkPosition.add(new ChunkPosition(this.railX - 1, this.railY + 1, this.railZ));
            this.railChunkPosition.add(new ChunkPosition(this.railX + 1, this.railY, this.railZ));
        }
        else if (par1 == 4)
        {
            this.railChunkPosition.add(new ChunkPosition(this.railX, this.railY + 1, this.railZ - 1));
            this.railChunkPosition.add(new ChunkPosition(this.railX, this.railY, this.railZ + 1));
        }
        else if (par1 == 5)
        {
            this.railChunkPosition.add(new ChunkPosition(this.railX, this.railY, this.railZ - 1));
            this.railChunkPosition.add(new ChunkPosition(this.railX, this.railY + 1, this.railZ + 1));
        }
        else if (par1 == 6)
        {
            this.railChunkPosition.add(new ChunkPosition(this.railX + 1, this.railY, this.railZ));
            this.railChunkPosition.add(new ChunkPosition(this.railX, this.railY, this.railZ + 1));
        }
        else if (par1 == 7)
        {
            this.railChunkPosition.add(new ChunkPosition(this.railX - 1, this.railY, this.railZ));
            this.railChunkPosition.add(new ChunkPosition(this.railX, this.railY, this.railZ + 1));
        }
        else if (par1 == 8)
        {
            this.railChunkPosition.add(new ChunkPosition(this.railX - 1, this.railY, this.railZ));
            this.railChunkPosition.add(new ChunkPosition(this.railX, this.railY, this.railZ - 1));
        }
        else if (par1 == 9)
        {
            this.railChunkPosition.add(new ChunkPosition(this.railX + 1, this.railY, this.railZ));
            this.railChunkPosition.add(new ChunkPosition(this.railX, this.railY, this.railZ - 1));
        }
    }

    private void refreshConnectedTracks()
    {
        for (int i = 0; i < this.railChunkPosition.size(); ++i)
        {
            RailLogic RailLogic = this.getRailLogic((ChunkPosition)this.railChunkPosition.get(i));

            if (RailLogic != null && RailLogic.isRailChunkPositionCorrect(this))
            {
                this.railChunkPosition.set(i, new ChunkPosition(RailLogic.railX, RailLogic.railY, RailLogic.railZ));
            }
            else
            {
                this.railChunkPosition.remove(i--);
            }
        }
    }

    private boolean isMinecartTrack(int par1, int par2, int par3)
    {
        return BlockCustomRail.isRailBlockAt(this.logicWorld, par1, par2, par3) ? true : (BlockCustomRail.isRailBlockAt(this.logicWorld, par1, par2 + 1, par3) ? true : BlockCustomRail.isRailBlockAt(this.logicWorld, par1, par2 - 1, par3));
    }

    private RailLogic getRailLogic(ChunkPosition par1ChunkPosition)
    {
        return BlockCustomRail.isRailBlockAt(this.logicWorld, par1ChunkPosition.x, par1ChunkPosition.y, par1ChunkPosition.z) ? new RailLogic(this.theRail, this.logicWorld, par1ChunkPosition.x, par1ChunkPosition.y, par1ChunkPosition.z) : (BlockCustomRail.isRailBlockAt(this.logicWorld, par1ChunkPosition.x, par1ChunkPosition.y + 1, par1ChunkPosition.z) ? new RailLogic(this.theRail, this.logicWorld, par1ChunkPosition.x, par1ChunkPosition.y + 1, par1ChunkPosition.z) : (BlockCustomRail.isRailBlockAt(this.logicWorld, par1ChunkPosition.x, par1ChunkPosition.y - 1, par1ChunkPosition.z) ? new RailLogic(this.theRail, this.logicWorld, par1ChunkPosition.x, par1ChunkPosition.y - 1, par1ChunkPosition.z) : null));
    }

    /**
     * Checks if the rail is at the chunk position it is expected to be.
     */
    private boolean isRailChunkPositionCorrect(RailLogic par1RailLogic)
    {
        for (int i = 0; i < this.railChunkPosition.size(); ++i)
        {
            ChunkPosition chunkposition = (ChunkPosition)this.railChunkPosition.get(i);

            if (chunkposition.x == par1RailLogic.railX && chunkposition.z == par1RailLogic.railZ)
            {
                return true;
            }
        }

        return false;
    }

    private boolean isPartOfTrack(int par1, int par2, int par3)
    {
        for (int l = 0; l < this.railChunkPosition.size(); ++l)
        {
            ChunkPosition chunkposition = (ChunkPosition)this.railChunkPosition.get(l);

            if (chunkposition.x == par1 && chunkposition.z == par3)
            {
                return true;
            }
        }

        return false;
    }

    public int getNumberOfAdjacentTracks()
    {
        int i = 0;

        if (this.isMinecartTrack(this.railX, this.railY, this.railZ - 1))
        {
            ++i;
        }

        if (this.isMinecartTrack(this.railX, this.railY, this.railZ + 1))
        {
            ++i;
        }

        if (this.isMinecartTrack(this.railX - 1, this.railY, this.railZ))
        {
            ++i;
        }

        if (this.isMinecartTrack(this.railX + 1, this.railY, this.railZ))
        {
            ++i;
        }

        return i;
    }

    private boolean canConnectTo(RailLogic par1RailLogic)
    {
        return this.isRailChunkPositionCorrect(par1RailLogic) ? true : (this.railChunkPosition.size() == 2 ? false : (this.railChunkPosition.isEmpty() ? true : true));
    }

    private void connectToNeighbor(RailLogic par1RailLogic)
    {
        this.railChunkPosition.add(new ChunkPosition(par1RailLogic.railX, par1RailLogic.railY, par1RailLogic.railZ));
        boolean flag = this.isPartOfTrack(this.railX, this.railY, this.railZ - 1);
        boolean flag1 = this.isPartOfTrack(this.railX, this.railY, this.railZ + 1);
        boolean flag2 = this.isPartOfTrack(this.railX - 1, this.railY, this.railZ);
        boolean flag3 = this.isPartOfTrack(this.railX + 1, this.railY, this.railZ);
        byte b0 = -1;

        if (flag || flag1)
        {
            b0 = 0;
        }

        if (flag2 || flag3)
        {
            b0 = 1;
        }

        if (!this.isStraightRail)
        {
            if (flag1 && flag3 && !flag && !flag2)
            {
                b0 = 6;
            }

            if (flag1 && flag2 && !flag && !flag3)
            {
                b0 = 7;
            }

            if (flag && flag2 && !flag1 && !flag3)
            {
                b0 = 8;
            }

            if (flag && flag3 && !flag1 && !flag2)
            {
                b0 = 9;
            }
        }

        if (b0 == 0 && canMakeSlopes)
        {
            if (BlockCustomRail.isRailBlockAt(this.logicWorld, this.railX, this.railY + 1, this.railZ - 1))
            {
                b0 = 4;
            }

            if (BlockCustomRail.isRailBlockAt(this.logicWorld, this.railX, this.railY + 1, this.railZ + 1))
            {
                b0 = 5;
            }
        }

        if (b0 == 1 && canMakeSlopes)
        {
            if (BlockCustomRail.isRailBlockAt(this.logicWorld, this.railX + 1, this.railY + 1, this.railZ))
            {
                b0 = 2;
            }

            if (BlockCustomRail.isRailBlockAt(this.logicWorld, this.railX - 1, this.railY + 1, this.railZ))
            {
                b0 = 3;
            }
        }

        if (b0 < 0)
        {
            b0 = 0;
        }

        int i = b0;

        if (this.isStraightRail)
        {
            i = this.logicWorld.getBlockMetadata(this.railX, this.railY, this.railZ) & 8 | b0;
        }

        this.logicWorld.setBlockMetadataWithNotify(this.railX, this.railY, this.railZ, i, 3);
    }

    private boolean canConnectFrom(int par1, int par2, int par3)
    {
        RailLogic railLogic = this.getRailLogic(new ChunkPosition(par1, par2, par3));

        if (railLogic == null)
        {
            return false;
        }
        else
        {
            railLogic.refreshConnectedTracks();
            return railLogic.canConnectTo(this);
        }
    }

    public void func_94511_a(boolean par1, boolean par2)
    {
        boolean flag2 = this.canConnectFrom(this.railX, this.railY, this.railZ - 1);
        boolean flag3 = this.canConnectFrom(this.railX, this.railY, this.railZ + 1);
        boolean flag4 = this.canConnectFrom(this.railX - 1, this.railY, this.railZ);
        boolean flag5 = this.canConnectFrom(this.railX + 1, this.railY, this.railZ);
        byte b0 = -1;

        if ((flag2 || flag3) && !flag4 && !flag5)
        {
            b0 = 0;
        }

        if ((flag4 || flag5) && !flag2 && !flag3)
        {
            b0 = 1;
        }

        if (!this.isStraightRail)
        {
            if (flag3 && flag5 && !flag2 && !flag4)
            {
                b0 = 6;
            }

            if (flag3 && flag4 && !flag2 && !flag5)
            {
                b0 = 7;
            }

            if (flag2 && flag4 && !flag3 && !flag5)
            {
                b0 = 8;
            }

            if (flag2 && flag5 && !flag3 && !flag4)
            {
                b0 = 9;
            }
        }

        if (b0 == -1)
        {
            if (flag2 || flag3)
            {
                b0 = 0;
            }

            if (flag4 || flag5)
            {
                b0 = 1;
            }

            if (!this.isStraightRail)
            {
                if (par1)
                {
                    if (flag3 && flag5)
                    {
                        b0 = 6;
                    }

                    if (flag4 && flag3)
                    {
                        b0 = 7;
                    }

                    if (flag5 && flag2)
                    {
                        b0 = 9;
                    }

                    if (flag2 && flag4)
                    {
                        b0 = 8;
                    }
                }
                else
                {
                    if (flag2 && flag4)
                    {
                        b0 = 8;
                    }

                    if (flag5 && flag2)
                    {
                        b0 = 9;
                    }

                    if (flag4 && flag3)
                    {
                        b0 = 7;
                    }

                    if (flag3 && flag5)
                    {
                        b0 = 6;
                    }
                }
            }
        }

        if (b0 == 0 && canMakeSlopes)
        {
            if (BlockCustomRail.isRailBlockAt(this.logicWorld, this.railX, this.railY + 1, this.railZ - 1))
            {
                b0 = 4;
            }

            if (BlockCustomRail.isRailBlockAt(this.logicWorld, this.railX, this.railY + 1, this.railZ + 1))
            {
                b0 = 5;
            }
        }

        if (b0 == 1 && canMakeSlopes)
        {
            if (BlockCustomRail.isRailBlockAt(this.logicWorld, this.railX + 1, this.railY + 1, this.railZ))
            {
                b0 = 2;
            }

            if (BlockCustomRail.isRailBlockAt(this.logicWorld, this.railX - 1, this.railY + 1, this.railZ))
            {
                b0 = 3;
            }
        }

        if (b0 < 0)
        {
            b0 = 0;
        }

        this.setBasicRail(b0);
        int i = b0;

        if (this.isStraightRail)
        {
            i = this.logicWorld.getBlockMetadata(this.railX, this.railY, this.railZ) & 8 | b0;
        }

        if (par2 || this.logicWorld.getBlockMetadata(this.railX, this.railY, this.railZ) != i)
        {
            this.logicWorld.setBlockMetadataWithNotify(this.railX, this.railY, this.railZ, i, 3);

            for (int j = 0; j < this.railChunkPosition.size(); ++j)
            {
                RailLogic RailLogic = this.getRailLogic((ChunkPosition)this.railChunkPosition.get(j));

                if (RailLogic != null)
                {
                    RailLogic.refreshConnectedTracks();

                    if (RailLogic.canConnectTo(this))
                    {
                        RailLogic.connectToNeighbor(this);
                    }
                }
            }
        }
    }
}
